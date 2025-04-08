import sys


def sort_file(filename, sort_by_AlgoId):
    
    try:
        with open(filename, 'r', encoding='utf-8') as f:
            lines = f.readlines()
            header = lines[:2]

            parsed_rows = [line.split('|') for line in lines[2:]]
            cleaned_rows = []
            for row in parsed_rows:
                if len(row) == 7:
                    cleaned_rows.append([row[1], row[2], row[3], row[4], row[5]])
                elif len(row) == 8:
                    cleaned_rows.append([row[1], (row[2][:-1] + '|' + row[3]), row[4], row[5], row[6]])
                else:
                    print(f"Parsing error: {row}")
            
            if sort_by_AlgoId:
                sorted_rows = sorted(cleaned_rows, key=lambda x: (int(x[2]), x[0]))
            else:
                sorted_rows = sorted(cleaned_rows, key=lambda x: (x[0], int(x[2]))) 
                        
    except FileNotFoundError:
        print(f"Error: File '{filename}' not found.")
        return
    
    try:
        with open(filename, 'w', encoding='utf-8') as f:
            f.writelines(header)
            for i,x in enumerate(sorted_rows):
                f.write('|')
                f.write('|'.join(x))
                f.write('|\n')

    except Exception as e:
        print(f"Error writing to file: {e}")

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python sort_file.py <filename>")
    else:
        filename = sys.argv[1]
        sort_file(filename, True) #True = sort by AlgoId then by Language.  False = sort by Language then by AlgoId.  Both are useful don't know which should be default.
        print(f"File '{filename}' sorted successfully.")
