import sys


def sort_file(filename):
    
    try:
        with open(filename, 'r', encoding='utf-8') as f:
            lines = f.readlines()
            header = lines[:2]

            parsed_rows = [line.split('|') for line in lines[2:]]
            stripped_rows = [[s.strip() for s in x] for x in parsed_rows]
            cleaned_rows = []
            for row in stripped_rows:
                if len(row) == 8:
                    cleaned_rows.append(row)
                elif len(row) == 9:
                    cleaned_rows.append([row[0], row[1], (row[2][:-1] + '|' + row[3]), row[4], row[5], row[6], row[7], row[8]])
                else:
                    print(f"Parsing error: {row}")
            
            formatted_rows = []
            for row in cleaned_rows:
                formatted_rows.append(['', f'{row[1]:^13}', f'{row[2]:^30}', f'{row[3]:^8}', f'{row[4]:^25}', f'{row[5]:^7}', f'{row[6]:^144}', '\n'])
            
            sorted_by_algo_id = sorted(formatted_rows, key=lambda x: (int(x[3]), x[1]))
            #assert(len(lines[2:]) == len(sorted_by_algo_id), "Something went wrong and the number of algorithms old vs. new doesn't match")
            sorted_by_language = sorted(formatted_rows, key=lambda x: (x[1], int(x[3]))) 
            #assert(len(lines[2:]) == len(sorted_by_language), "Something went wrong and the number of algorithms old vs. new doesn't match")
            if len(lines[2:]) != len(sorted_by_language):
                print(f"Something went wrong and the number of algorithms old {len(lines[2:])} vs. new {len(sorted_by_language)} doesn't match")

                        
    except FileNotFoundError:
        print(f"Error: File '{filename}' not found.")
        return
    
    try:
        with open(filename, 'w', encoding='utf-8') as f: # default ALGORITHMS.md file sorted by AlgoId then by Language
            f.writelines(header)
            for i,x in enumerate(sorted_by_algo_id):
                f.write('|'.join(x))

        with open('ALGORITHMS_SORTED_BY_LANGUAGE.md', 'w', encoding='utf-8') as f: # create new convience file sorted by Language then by AlgoId
            f.writelines(header)
            for i,x in enumerate(sorted_by_language):
                f.write('|'.join(x))

    except Exception as e:
        print(f"Error writing to file: {e}")

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python sort_file.py <filename>")
    else:
        filename = sys.argv[1]
        sort_file(filename)
        print(f"File '{filename}' sorted successfully.")
