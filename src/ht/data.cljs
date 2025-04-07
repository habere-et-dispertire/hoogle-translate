(ns ht.data)

(def by-key-map
  {
"J@/ (insert)@-@1" {:lang "J" :algo "/ (insert)" :lib "-" :id 1 :doc "https://code.jsoftware.com/wiki/Vocabulary/slash" :sig "-"}
"APL@/ (reduce)@-@1" {:lang "APL" :algo "/ (reduce)" :lib "-" :id 1 :doc "http://microapl.com/apl_help/ch_020_020_800.htm" :sig "-"}
"C++@accumulate@<numeric>@1" {:lang "C++" :algo "accumulate" :lib "<numeric>" :id 1 :doc "https://en.cppreference.com/w/cpp/algorithm/accumulate" :sig "-"}
"C#@Aggregate@Enumerable@1" {:lang "C#" :algo "Aggregate" :lib "Enumerable" :id 1 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.aggregate" :sig "-"}
"Rust@fold@trait.Iterator@1" {:lang "Rust" :algo "fold" :lib "trait.Iterator" :id 1 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.fold" :sig "-"}
"Haskell@foldl@Data.List@1" {:lang "Haskell" :algo "foldl" :lib "Data.List" :id 1 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:foldl" :sig "-"}
"Racket@foldl@base@1" {:lang "Racket" :algo "foldl" :lib "base" :id 1 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Fprivate%2Flist..rkt%29._foldl%29%29" :sig "-"}
"Uiua@∧ (fold)@-@1" {:lang "Uiua" :algo "∧ (fold)" :lib "-" :id 1 :doc "https://www.uiua.org/docs/fold" :sig "-"}
"q@over@-@1" {:lang "q" :algo "over" :lib "-" :id 1 :doc "https://code.kx.com/q/ref/over/" :sig "-"}
"C++@reduce@<numeric>@1" {:lang "C++" :algo "reduce" :lib "<numeric>" :id 1 :doc "https://en.cppreference.com/w/cpp/algorithm/reduce" :sig "-"}
"Clojure@reduce@core@1" {:lang "Clojure" :algo "reduce" :lib "core" :id 1 :doc "https://clojuredocs.org/clojure.core/reduce" :sig "-"}
"CUDA@reduce@Thrust@1" {:lang "CUDA" :algo "reduce" :lib "Thrust" :id 1 :doc "https://thrust.github.io/doc/group__reductions_ga43eea9a000f912716189687306884fc7.html" :sig "-"}
"D@reduce@algorithm.iteration@1" {:lang "D" :algo "reduce" :lib "algorithm.iteration" :id 1 :doc "https://dlang.org/library/std/algorithm/iteration/reduce.html" :sig "-"}
"Elixir@reduce@Enum@1" {:lang "Elixir" :algo "reduce" :lib "Enum" :id 1 :doc "https://hexdocs.pm/elixir/Enum.html#reduce/2" :sig "-"}
"Java@reduce@Streams@1" {:lang "Java" :algo "reduce" :lib "Streams" :id 1 :doc "https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#reduce-java.util.function.BinaryOperator-" :sig "-"}
"Kotlin@reduce@collections@1" {:lang "Kotlin" :algo "reduce" :lib "collections" :id 1 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reduce.html" :sig "-"}
"Python@reduce@functools@1" {:lang "Python" :algo "reduce" :lib "functools" :id 1 :doc "https://docs.python.org/3/library/functools.html#functools.reduce" :sig "-"}
"Ruby@reduce@Enumerable@1" {:lang "Ruby" :algo "reduce" :lib "Enumerable" :id 1 :doc "https://apidock.com/ruby/Enumerable/reduce" :sig "-"}
"Uiua@/ (reduce)@-@1" {:lang "Uiua" :algo "/ (reduce)" :lib "-" :id 1 :doc "https://www.uiua.org/docs/reduce" :sig "-"}
"APL@¨ (each)@-@2" {:lang "APL" :algo "¨ (each)" :lib "-" :id 2 :doc "http://microapl.com/apl_help/ch_020_020_900.htm" :sig "-"}
"J@each@-@2" {:lang "J" :algo "each" :lib "-" :id 2 :doc "https://www.jsoftware.com/help/primer/each.htm" :sig "-"}
"q@each@-@2" {:lang "q" :algo "each" :lib "-" :id 2 :doc "https://code.kx.com/q/ref/each/" :sig "-"}
"Uiua@∵ (each)@-@2" {:lang "Uiua" :algo "∵ (each)" :lib "-" :id 2 :doc "https://www.uiua.org/docs/each" :sig "-"}
"Clojure@map@core@2" {:lang "Clojure" :algo "map" :lib "core" :id 2 :doc "https://clojuredocs.org/clojure.core/map" :sig "-"}
"D@map@algorithm.iteration@2" {:lang "D" :algo "map" :lib "algorithm.iteration" :id 2 :doc "https://dlang.org/library/std/algorithm/iteration/map.html" :sig "-"}
"Elixir@map@Enum@2" {:lang "Elixir" :algo "map" :lib "Enum" :id 2 :doc "https://hexdocs.pm/elixir/Enum.html#map/2" :sig "-"}
"Haskell@map@Data.List@2" {:lang "Haskell" :algo "map" :lib "Data.List" :id 2 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:map" :sig "-"}
"Java@map@Streams@2" {:lang "Java" :algo "map" :lib "Streams" :id 2 :doc "https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#map-java.util.function.Function-" :sig "-"}
"Kotlin@map@collections@2" {:lang "Kotlin" :algo "map" :lib "collections" :id 2 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map.html" :sig "-"}
"Python@map@-@2" {:lang "Python" :algo "map" :lib "-" :id 2 :doc "https://docs.python.org/3/library/functions.html#map" :sig "-"}
"Racket@map@base@2" {:lang "Racket" :algo "map" :lib "base" :id 2 :doc "https://docs.racket-lang.org/reference/pairs.html?q=map#%28def._%28%28lib._racket%2Fprivate%2Fmap..rkt%29._map%29%29" :sig "-"}
"Ruby@map@Enumerable@2" {:lang "Ruby" :algo "map" :lib "Enumerable" :id 2 :doc "https://apidock.com/ruby/Enumerable/map" :sig "-"}
"Rust@map@trait.Iterator@2" {:lang "Rust" :algo "map" :lib "trait.Iterator" :id 2 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.map" :sig "-"}
"Scala@map@various@2" {:lang "Scala" :algo "map" :lib "various" :id 2 :doc "https://scala-lang.org/api/current/scala/collection/IterableOps.html#map-5d3" :sig "-"}
"C++@transform@<algorithm>@2" {:lang "C++" :algo "transform" :lib "<algorithm>" :id 2 :doc "https://en.cppreference.com/w/cpp/algorithm/transform" :sig "-"}
"Uiua@≡ (rows)@-@2" {:lang "Uiua" :algo "≡ (rows)" :lib "-" :id 2 :doc "https://www.uiua.org/docs/rows" :sig "-"}
"APL@/ (compress)@-@3" {:lang "APL" :algo "/ (compress)" :lib "-" :id 3 :doc "http://microapl.com/apl_help/ch_020_020_840.htm" :sig "-"}
"Haskell@filter@Data.List@3" {:lang "Haskell" :algo "filter" :lib "Data.List" :id 3 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:filter" :sig "-"}
"Uiua@▽ (keep)@-@3" {:lang "Uiua" :algo "▽ (keep)" :lib "-" :id 3 :doc "https://www.uiua.org/docs/keep" :sig "-"}
"J@\\ (prefix)@-@4" {:lang "J" :algo "\\ (prefix)" :lib "-" :id 4 :doc "https://code.jsoftware.com/wiki/Vocabulary/bslash" :sig "-"}
"APL@\\ (scan)@-@4" {:lang "APL" :algo "\\ (scan)" :lib "-" :id 4 :doc "http://microapl.com/apl_help/ch_020_020_820.htm" :sig "-"}
"Python@accumulate@itertools@4" {:lang "Python" :algo "accumulate" :lib "itertools" :id 4 :doc "https://docs.python.org/3/library/itertools.html#itertools.accumulate" :sig "-"}
"D@cumulativeFold@algorithm.iteration@4" {:lang "D" :algo "cumulativeFold" :lib "algorithm.iteration" :id 4 :doc "https://dlang.org/library/std/algorithm/iteration/cumulative_fold.html" :sig "-"}
"C++@inclusive_scan@<numeric>@4" {:lang "C++" :algo "inclusive_scan" :lib "<numeric>" :id 4 :doc "https://en.cppreference.com/w/cpp/algorithm/inclusive_scan" :sig "-"}
"CUDA@inclusive_scan@Thrust@4" {:lang "CUDA" :algo "inclusive_scan" :lib "Thrust" :id 4 :doc "https://thrust.github.io/doc/group__prefixsums_gafb24ad76101263038b0acaddc094d70a.html" :sig "-"}
"C++@partial_sum@<numeric>@4" {:lang "C++" :algo "partial_sum" :lib "<numeric>" :id 4 :doc "https://en.cppreference.com/w/cpp/algorithm/partial_sum" :sig "-"}
"Clojure@reductions@core@4" {:lang "Clojure" :algo "reductions" :lib "core" :id 4 :doc "https://clojuredocs.org/clojure.core/reductions" :sig "-"}
"q@scan@-@4" {:lang "q" :algo "scan" :lib "-" :id 4 :doc "https://code.kx.com/q/ref/over/" :sig "-"}
"Rust@scan@trait.Iterator@4" {:lang "Rust" :algo "scan" :lib "trait.Iterator" :id 4 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.scan" :sig "-"}
"Scala@scan@various@4" {:lang "Scala" :algo "scan" :lib "various" :id 4 :doc "https://scala-lang.org/api/current/scala/collection/IterableOps.html#scan-fffff9e1" :sig "-"}
"Kotlin@runningReduce@collections@4" {:lang "Kotlin" :algo "runningReduce" :lib "collections" :id 4 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/running-reduce.html" :sig "-"}
"F#@scan@Seq@4" {:lang "F#" :algo "scan" :lib "Seq" :id 4 :doc "https://docs.microsoft.com/en-us/dotnet/fsharp/language-reference/sequences" :sig "-"}
"Elixir@scan@Enum@4" {:lang "Elixir" :algo "scan" :lib "Enum" :id 4 :doc "https://hexdocs.pm/elixir/Enum.html#scan/2" :sig "-"}
"Haskell@scanl1@Data.List@4" {:lang "Haskell" :algo "scanl1" :lib "Data.List" :id 4 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:scanl1" :sig "-"}
"Python@cumsum@RAPIDS cuDF@4" {:lang "Python" :algo "cumsum" :lib "RAPIDS cuDF" :id 4 :doc "https://docs.rapids.ai/api/cudf/nightly/api.html#cudf.core.series.Series.cumsum" :sig "-"}
"Python@cumsum@pandas@4" {:lang "Python" :algo "cumsum" :lib "pandas" :id 4 :doc "https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.Series.cumsum.html?highlight=cumsum#pandas.Series.cumsum" :sig "-"}
"Uiua@\\ (scan)@-@4" {:lang "Uiua" :algo "\\ (scan)" :lib "-" :id 4 :doc "https://www.uiua.org/docs/scan" :sig "-"}
"APL@/ (n-wise reduce)@-@5" {:lang "APL" :algo "/ (n-wise reduce)" :lib "-" :id 5 :doc "http://microapl.com/apl_help/ch_020_020_800.htm" :sig "-"}
"C++@adjacent_difference@<numeric>@5" {:lang "C++" :algo "adjacent_difference" :lib "<numeric>" :id 5 :doc "https://en.cppreference.com/w/cpp/algorithm/adjacent_difference" :sig "-"}
"CUDA@adjacent_difference@Thrust@5" {:lang "CUDA" :algo "adjacent_difference" :lib "Thrust" :id 5 :doc "https://thrust.github.io/doc/group__transformations_gaa41d309b53fa03bf13fe35a184148400.html" :sig "-"}
"Haskell@mapAdjacent@Data.List.HT@5" {:lang "Haskell" :algo "mapAdjacent" :lib "Data.List.HT" :id 5 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:mapAdjacent" :sig "-"}
"q@prior@-@5" {:lang "q" :algo "prior" :lib "-" :id 5 :doc "https://code.kx.com/q/ref/prior/" :sig "-"}
"Kotlin@zipWithNext@collections@5" {:lang "Kotlin" :algo "zipWithNext" :lib "collections" :id 5 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/zip-with-next.html" :sig "-"}
"Python@pairwise@itertools@5" {:lang "Python" :algo "pairwise" :lib "itertools" :id 5 :doc "https://docs.python.org/3/library/itertools.html#itertools.pairwise" :sig "-"}
"Uiua@⧈ (stencil)@-@5" {:lang "Uiua" :algo "⧈ (stencil)" :lib "-" :id 5 :doc "https://www.uiua.org/docs/stencil" :sig "-"}
"APL@∘. (outer product)@-@6" {:lang "APL" :algo "∘. (outer product)" :lib "-" :id 6 :doc "http://microapl.com/apl_help/ch_020_020_890.htm" :sig "-"}
"Haskell@outerProduct@Data.List.HT@6" {:lang "Haskell" :algo "outerProduct" :lib "Data.List.HT" :id 6 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:outerProduct" :sig "-"}
"Clojure@outer-product@core.matrix@6" {:lang "Clojure" :algo "outer-product" :lib "core.matrix" :id 6 :doc "https://mikera.github.io/core.matrix/doc/clojure.core.matrix.html#var-outer-product" :sig "-"}
"APL@. (inner product)@-@7" {:lang "APL" :algo ". (inner product)" :lib "-" :id 7 :doc "http://microapl.com/apl_help/ch_020_020_880.htm" :sig "-"}
"C++@inner_product@<numeric>@7" {:lang "C++" :algo "inner_product" :lib "<numeric>" :id 7 :doc "https://en.cppreference.com/w/cpp/algorithm/inner_product" :sig "-"}
"Rust@.. / Range@ops@8" {:lang "Rust" :algo ".. / Range" :lib "ops" :id 8 :doc "https://doc.rust-lang.org/std/ops/struct.Range.html" :sig "-"}
"APL@⍳ (index generator)@-@8" {:lang "APL" :algo "⍳ (index generator)" :lib "-" :id 8 :doc "http://microapl.com/apl_help/ch_020_020_150.htm" :sig "-"}
"J@i. (integers)@-@8" {:lang "J" :algo "i. (integers)" :lib "-" :id 8 :doc "https://code.jsoftware.com/wiki/Vocabulary/idot" :sig "-"}
"C++@iota@<numeric>@8" {:lang "C++" :algo "iota" :lib "<numeric>" :id 8 :doc "https://en.cppreference.com/w/cpp/algorithm/iota" :sig "-"}
"D@iota@range@8" {:lang "D" :algo "iota" :lib "range" :id 8 :doc "https://dlang.org/library/std/range/iota.html" :sig "-"}
"Go@iota@-@8" {:lang "Go" :algo "iota" :lib "-" :id 8 :doc "https://github.com/golang/go/wiki/Iota" :sig "-"}
"Clojure@range@core@8" {:lang "Clojure" :algo "range" :lib "core" :id 8 :doc "https://clojuredocs.org/clojure.core/range" :sig "-"}
"Haskell@range@Data.List.HT@8" {:lang "Haskell" :algo "range" :lib "Data.List.HT" :id 8 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:range" :sig "-"}
"Python@range@-@8" {:lang "Python" :algo "range" :lib "-" :id 8 :doc "https://docs.python.org/3/library/functions.html#func-range" :sig "-"}
"Racket@range@base@8" {:lang "Racket" :algo "range" :lib "base" :id 8 :doc "https://docs.racket-lang.org/reference/pairs.html?q=enumerate#%28def._%28%28lib._racket%2Flist..rkt%29._range%29%29" :sig "-"}
"CUDA@sequence@Thrust@8" {:lang "CUDA" :algo "sequence" :lib "Thrust" :id 8 :doc "https://thrust.github.io/doc/group__transformations_ga233a3db0c5031023c8e9385acd4b9759.html" :sig "-"}
"q@til@-@8" {:lang "q" :algo "til" :lib "-" :id 8 :doc "https://code.kx.com/q/ref/til/" :sig "-"}
"Scala@until@Range@8" {:lang "Scala" :algo "until" :lib "Range" :id 8 :doc "https://scala-lang.org/api/current/scala/collection/immutable/Range.html" :sig "-"}
"Uiua@⇡ (range)@-@8" {:lang "Uiua" :algo "⇡ (range)" :lib "-" :id 8 :doc "https://www.uiua.org/docs/range" :sig "-"}
"D@enumerate@range@9" {:lang "D" :algo "enumerate" :lib "range" :id 9 :doc "https://dlang.org/library/std/range/enumerate.html" :sig "-"}
"F#@indexed@various@9" {:lang "F#" :algo "indexed" :lib "various" :id 9 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-arraymodule.html#indexed" :sig "-"}
"Julia@enumerate@Base@9" {:lang "Julia" :algo "enumerate" :lib "Base" :id 9 :doc "https://docs.julialang.org/en/v1/base/iterators/#Base.Iterators.enumerate" :sig "-"}
"Python@enumerate@-@9" {:lang "Python" :algo "enumerate" :lib "-" :id 9 :doc "https://docs.python.org/3/library/functions.html#enumerate" :sig "-"}
"Racket@enumerate@list-utils@9" {:lang "Racket" :algo "enumerate" :lib "list-utils" :id 9 :doc "https://docs.racket-lang.org/list-utils/index.html?q=freq#%28def._%28%28lib._list-utils%2Fmain..rkt%29._enumerate%29%29" :sig "-"}
"Rust@enumerate@trait.Iterator@9" {:lang "Rust" :algo "enumerate" :lib "trait.Iterator" :id 9 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.enumerate" :sig "-"}
"Haskell@indexed@Data.List.Index@9" {:lang "Haskell" :algo "indexed" :lib "Data.List.Index" :id 9 :doc "https://hackage.haskell.org/package/ilist-0.4.0.0/docs/Data-List-Index.html#v:indexed" :sig "-"}
"Racket@indexed@data-collections@9" {:lang "Racket" :algo "indexed" :lib "data-collections" :id 9 :doc "https://docs.racket-lang.org/collections/collections-api.html?q=chunk-while#%28def._%28%28lib._data%2Fcollection..rkt%29._indexed%29%29" :sig "-"}
"Clojure@map-indexed*@core@9" {:lang "Clojure" :algo "map-indexed*" :lib "core" :id 9 :doc "https://clojuredocs.org/clojure.core/map-indexed" :sig "-"}
"C#@Select@Enumerable@9" {:lang "C#" :algo "Select" :lib "Enumerable" :id 9 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.select" :sig "-"}
"Elixir@with_index@Enum@9" {:lang "Elixir" :algo "with_index" :lib "Enum" :id 9 :doc "https://hexdocs.pm/elixir/Enum.html#with_index/2" :sig "-"}
"Ruby@with_index@Enumerable@9" {:lang "Ruby" :algo "with_index" :lib "Enumerable" :id 9 :doc "https://apidock.com/ruby/Enumerator/with_index" :sig "-"}
"Kotlin@withIndex@collections@9" {:lang "Kotlin" :algo "withIndex" :lib "collections" :id 9 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/with-index.html" :sig "-"}
"Scala@zipWithIndex@various@9" {:lang "Scala" :algo "zipWithIndex" :lib "various" :id 9 :doc "https://scala-lang.org/api/current/scala/collection/IterableOps.html#zipWithIndex-0" :sig "-"}
"Haskell@partition@Data.List@10" {:lang "Haskell" :algo "partition" :lib "Data.List" :id 10 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Data-List.html#v:partition" :sig "-"}
"Kotlin@partition@collections@10" {:lang "Kotlin" :algo "partition" :lib "collections" :id 10 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/partition.html" :sig "-"}
"Python@partition@more-itertools@10" {:lang "Python" :algo "partition" :lib "more-itertools" :id 10 :doc "https://more-itertools.readthedocs.io/en/stable/api.html#more_itertools.partition" :sig "-"}
"Racket@partition@base@10" {:lang "Racket" :algo "partition" :lib "base" :id 10 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Flist..rkt%29._partition%29%29" :sig "-"}
"Ruby@partition@Enumerable@10" {:lang "Ruby" :algo "partition" :lib "Enumerable" :id 10 :doc "https://apidock.com/ruby/Enumerable/partition" :sig "-"}
"Rust@partition@trait.Iterator@10" {:lang "Rust" :algo "partition" :lib "trait.Iterator" :id 10 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.partition" :sig "-"}
"C++@partition_copy@<algorithm>@10" {:lang "C++" :algo "partition_copy" :lib "<algorithm>" :id 10 :doc "https://en.cppreference.com/w/cpp/algorithm/partition_copy" :sig "-"}
"Elixir@split_with@Enum@10" {:lang "Elixir" :algo "split_with" :lib "Enum" :id 10 :doc "https://hexdocs.pm/elixir/Enum.html#split_with/2" :sig "-"}
"Clojure@partition@core@11" {:lang "Clojure" :algo "partition" :lib "core" :id 11 :doc "https://clojuredocs.org/clojure.core/partition" :sig "-"}
"C++@partition@<algorithm>@13" {:lang "C++" :algo "partition" :lib "<algorithm>" :id 13 :doc "https://en.cppreference.com/w/cpp/algorithm/partition" :sig "-"}
"CUDA@partition@Thrust@13" {:lang "CUDA" :algo "partition" :lib "Thrust" :id 13 :doc "https://thrust.github.io/doc/group__partitioning_gac5cdbb402c5473ca92e95bc73ecaf13c.html" :sig "-"}
"D@partition@algorithm.sorting@13" {:lang "D" :algo "partition" :lib "algorithm.sorting" :id 13 :doc "https://dlang.org/library/std/algorithm/sorting/partition.html" :sig "-"}
"Shell@uniq@-@14" {:lang "Shell" :algo "uniq" :lib "-" :id 14 :doc "https://ss64.com/bash/uniq.html" :sig "-"}
"D@uniq@algorithm.iteration@14" {:lang "D" :algo "uniq" :lib "algorithm.iteration" :id 14 :doc "https://dlang.org/phobos/std_algorithm_iteration.html#uniq" :sig "-"}
"C++@unique@<algorithm>@14" {:lang "C++" :algo "unique" :lib "<algorithm>" :id 14 :doc "https://en.cppreference.com/w/cpp/algorithm/unique" :sig "-"}
"C#@Distinct@Enumerable@15" {:lang "C#" :algo "Distinct" :lib "Enumerable" :id 15 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.distinct" :sig "-"}
"Clojure@distinct@core@15" {:lang "Clojure" :algo "distinct" :lib "core" :id 15 :doc "https://clojuredocs.org/clojure.core/distinct" :sig "-"}
"Kotlin@distinct@collections@15" {:lang "Kotlin" :algo "distinct" :lib "collections" :id 15 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/distinct.html" :sig "-"}
"Scala@distinct@various@15" {:lang "Scala" :algo "distinct" :lib "various" :id 15 :doc "https://scala-lang.org/api/current/scala/collection/SeqOps.html#distinct-0" :sig "-"}
"Haskell@nub@Data.List@15" {:lang "Haskell" :algo "nub" :lib "Data.List" :id 15 :doc "https://hackage.haskell.org/package/base-4.18.1.0/docs/Data-List.html#v:nub" :sig "-"}
"Haskell@sortUniq@Data.List.Unique@15" {:lang "Haskell" :algo "sortUniq" :lib "Data.List.Unique" :id 15 :doc "https://hackage.haskell.org/package/Unique-0.4.7.7/docs/Data-List-Unique.html#v:sortUniq" :sig "-"}
"Elixir@uniq@Enum@15" {:lang "Elixir" :algo "uniq" :lib "Enum" :id 15 :doc "https://hexdocs.pm/elixir/Enum.html#uniq/1" :sig "-"}
"Ruby@uniq@Array@15" {:lang "Ruby" :algo "uniq" :lib "Array" :id 15 :doc "https://apidock.com/ruby/Array/uniq" :sig "-"}
"Rust@unique@itertools@15" {:lang "Rust" :algo "unique" :lib "itertools" :id 15 :doc "https://docs.rs/itertools/0.7.6/itertools/structs/struct.Unique.html" :sig "-"}
"Uiua@◴ (deduplicate)@-@15" {:lang "Uiua" :algo "◴ (deduplicate)" :lib "-" :id 15 :doc "https://www.uiua.org/docs/deduplicate" :sig "-"}
"J@\": (default format)@-@16" {:lang "J" :algo "\": (default format)" :lib "-" :id 16 :doc "https://code.jsoftware.com/wiki/Vocabulary/quoteco" :sig "-"}
"APL@⍕ (format)@-@16" {:lang "APL" :algo "⍕ (format)" :lib "-" :id 16 :doc "http://microapl.com/apl_help/ch_020_020_680.htm" :sig "-"}
"Haskell@show@Prelude@16" {:lang "Haskell" :algo "show" :lib "Prelude" :id 16 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:show" :sig "-"}
"Clojure@str@core@16" {:lang "Clojure" :algo "str" :lib "core" :id 16 :doc "https://clojuredocs.org/clojure.core/str" :sig "-"}
"Python@str@-@16" {:lang "Python" :algo "str" :lib "-" :id 16 :doc "https://docs.python.org/3/library/stdtypes.html#text-sequence-type-str" :sig "-"}
"q@string@-@16" {:lang "q" :algo "string" :lib "-" :id 16 :doc "https://code.kx.com/v2/ref/string/" :sig "-"}
"C++@to_string@<string>@16" {:lang "C++" :algo "to_string" :lib "<string>" :id 16 :doc "https://en.cppreference.com/w/cpp/string/basic_string/to_string" :sig "-"}
"Elixir@to_string@various@16" {:lang "Elixir" :algo "to_string" :lib "various" :id 16 :doc "https://hexdocs.pm/elixir/Integer.html#to_string/1" :sig "-"}
"Rust@to_string@string@16" {:lang "Rust" :algo "to_string" :lib "string" :id 16 :doc "https://doc.rust-lang.org/std/string/trait.ToString.html" :sig "-"}
"Scala@toString@various@16" {:lang "Scala" :algo "toString" :lib "various" :id 16 :doc "https://scala-lang.org/api/current/scala/reflect/AnyValManifest.html#toString-0" :sig "-"}
"D@canFind@algorithm.searching@17" {:lang "D" :algo "canFind" :lib "algorithm.searching" :id 17 :doc "https://dlang.org/library/std/algorithm/searching/can_find.can_find.html" :sig "-"}
"Kotlin@contains@collections@17" {:lang "Kotlin" :algo "contains" :lib "collections" :id 17 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/contains.html" :sig "-"}
"Scala@contains@various@17" {:lang "Scala" :algo "contains" :lib "various" :id 17 :doc "https://scala-lang.org/api/current/scala/collection/Iterator.html#contains-4ad" :sig "-"}
"Clojure@contains?@core@17" {:lang "Clojure" :algo "contains?" :lib "core" :id 17 :doc "https://clojuredocs.org/clojure.core/contains_q" :sig "-"}
"Haskell@elem@Prelude@17" {:lang "Haskell" :algo "elem" :lib "Prelude" :id 17 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:elem" :sig "-"}
"Python@in@-@17" {:lang "Python" :algo "in" :lib "-" :id 17 :doc "https://www.programiz.com/python-programming/keyword-list#in" :sig "-"}
"Ruby@include?@various@17" {:lang "Ruby" :algo "include?" :lib "various" :id 17 :doc "https://apidock.com/ruby/Array/include%3F" :sig "-"}
"Racket@member*@base@17" {:lang "Racket" :algo "member*" :lib "base" :id 17 :doc "https://docs.racket-lang.org/reference/pairs.html?q=map#%28def._%28%28lib._racket%2Fprivate%2Fbase..rkt%29._member%29%29" :sig "-"}
"Elixir@member?@Enum@17" {:lang "Elixir" :algo "member?" :lib "Enum" :id 17 :doc "https://hexdocs.pm/elixir/Enum.html#member?/2" :sig "-"}
"Uiua@∊ (memberof)@-@17" {:lang "Uiua" :algo "∊ (memberof)" :lib "-" :id 17 :doc "http://uiua.org/docs/memberof" :sig "-"}
"APL@⍸ (where)@-@18" {:lang "APL" :algo "⍸ (where)" :lib "-" :id 18 :doc "https://help.dyalog.com/17.1/#Language/Primitive%20Functions/Where.htm#kanchor3608" :sig "-"}
"F#@where@various@18" {:lang "F#" :algo "where" :lib "various" :id 18 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-arraymodule.html#where" :sig "-"}
"q@where@-@18" {:lang "q" :algo "where" :lib "-" :id 18 :doc "https://code.kx.com/q4m3/A_Built-in_Functions/#a107-where" :sig "-"}
"Haskell@count@Data.List.Unique@19" {:lang "Haskell" :algo "count" :lib "Data.List.Unique" :id 19 :doc "https://hackage.haskell.org/package/Unique-0.4.7.7/docs/Data-List-Unique.html#v:count" :sig "-"}
"Python@Counter*@collections@19" {:lang "Python" :algo "Counter*" :lib "collections" :id 19 :doc "https://docs.python.org/3/library/collections.html#collections.Counter" :sig "-"}
"Clojure@frequencies@core@19" {:lang "Clojure" :algo "frequencies" :lib "core" :id 19 :doc "https://clojuredocs.org/clojure.core/frequencies" :sig "-"}
"Racket@frequencies@list-utils@19" {:lang "Racket" :algo "frequencies" :lib "list-utils" :id 19 :doc "https://docs.racket-lang.org/list-utils/index.html?q=freq#%28def._%28%28lib._list-utils%2Fmain..rkt%29._frequencies%29%29" :sig "-"}
"Python@value_counts@RAPIDS cuDF@19" {:lang "Python" :algo "value_counts" :lib "RAPIDS cuDF" :id 19 :doc "https://docs.rapids.ai/api/cudf/stable/api.html#cudf.core.series.Series.value_counts" :sig "-"}
"Python@value_counts@pandas@19" {:lang "Python" :algo "value_counts" :lib "pandas" :id 19 :doc "https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.Series.value_counts.html" :sig "-"}
"D@any@algorithm.searching@20" {:lang "D" :algo "any" :lib "algorithm.searching" :id 20 :doc "https://dlang.org/library/std/algorithm/searching/any.html" :sig "-"}
"Haskell@any@Prelude@20" {:lang "Haskell" :algo "any" :lib "Prelude" :id 20 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:any" :sig "-"}
"Kotlin@any@collections@20" {:lang "Kotlin" :algo "any" :lib "collections" :id 20 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html" :sig "-"}
"Python@any@-@20" {:lang "Python" :algo "any" :lib "-" :id 20 :doc "https://docs.python.org/3/library/functions.html#any" :sig "-"}
"Rust@any@trait.Iterator@20" {:lang "Rust" :algo "any" :lib "trait.Iterator" :id 20 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.any" :sig "-"}
"Elixir@any?@Enum@20" {:lang "Elixir" :algo "any?" :lib "Enum" :id 20 :doc "https://hexdocs.pm/elixir/Enum.html#any?/2" :sig "-"}
"Ruby@any?@Enumerable@20" {:lang "Ruby" :algo "any?" :lib "Enumerable" :id 20 :doc "https://apidock.com/ruby/Enumerable/any%3F" :sig "-"}
"C++@any_of@<algorithm>@20" {:lang "C++" :algo "any_of" :lib "<algorithm>" :id 20 :doc "https://en.cppreference.com/w/cpp/algorithm/all_any_none_of" :sig "-"}
"F#@exists@List@20" {:lang "F#" :algo "exists" :lib "List" :id 20 :doc "https://docs.microsoft.com/en-us/dotnet/fsharp/language-reference/lists" :sig "-"}
"Scala@exists@various@20" {:lang "Scala" :algo "exists" :lib "various" :id 20 :doc "https://scala-lang.org/api/current/scala/collection/IterableOnceOps.html#exists-fffff66f" :sig "-"}
"Racket@memf*@base@20" {:lang "Racket" :algo "memf*" :lib "base" :id 20 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Fprivate%2Flist..rkt%29._memf%29%29" :sig "-"}
"Clojure@some@core@20" {:lang "Clojure" :algo "some" :lib "core" :id 20 :doc "https://clojuredocs.org/clojure.core/some" :sig "-"}
"APL@, (catenate)@-@21" {:lang "APL" :algo ", (catenate)" :lib "-" :id 21 :doc "http://microapl.com/apl_help/ch_020_020_490.htm" :sig "-"}
"Haskell@concat@Prelude@21" {:lang "Haskell" :algo "concat" :lib "Prelude" :id 21 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Prelude.html#v:concat" :sig "-"}
"Racket@join@base@21" {:lang "Racket" :algo "join" :lib "base" :id 21 :doc "https://docs.racket-lang.org/algebraic/class_base.html?q=some#%28def._%28%28lib._algebraic%2Fcontrol%2Fmonad..rkt%29._join%29%29" :sig "-"}
"Ruby@join@various@21" {:lang "Ruby" :algo "join" :lib "various" :id 21 :doc "https://apidock.com/ruby/Array/join" :sig "-"}
"Clojure@join@string@21" {:lang "Clojure" :algo "join" :lib "string" :id 21 :doc "https://clojuredocs.org/clojure.string/join" :sig "-"}
"D@join@array@21" {:lang "D" :algo "join" :lib "array" :id 21 :doc "https://dlang.org/library/std/array/join.html" :sig "-"}
"Rust@join@Vec@21" {:lang "Rust" :algo "join" :lib "Vec" :id 21 :doc "https://doc.rust-lang.org/std/vec/struct.Vec.html#method.join" :sig "-"}
"Go@join@strings@21" {:lang "Go" :algo "join" :lib "strings" :id 21 :doc "https://golang.org/pkg/strings/#Join" :sig "-"}
"C#@join@String@21" {:lang "C#" :algo "join" :lib "String" :id 21 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.string.join?view=netframework-4.8" :sig "-"}
"F#@join@String@21" {:lang "F#" :algo "join" :lib "String" :id 21 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.string.join?view=netframework-4.8" :sig "-"}
"Python@join*@str@21" {:lang "Python" :algo "join*" :lib "str" :id 21 :doc "https://docs.python.org/3/library/stdtypes.html#str.join" :sig "-"}
"Kotlin@joinTo@collections@21" {:lang "Kotlin" :algo "joinTo" :lib "collections" :id 21 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to.html" :sig "-"}
"Uiua@⊂ (join)@-@21" {:lang "Uiua" :algo "⊂ (join)" :lib "-" :id 21 :doc "https://www.uiua.org/docs/join" :sig "-"}
"Python@zip(*)@-@22" {:lang "Python" :algo "zip(*)" :lib "-" :id 22 :doc "https://docs.python.org/3/library/functions.html#zip" :sig "-"}
"Python@transpose@pandas@22" {:lang "Python" :algo "transpose" :lib "pandas" :id 22 :doc "https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.DataFrame.transpose.html" :sig "-"}
"Ruby@transpose@Array@22" {:lang "Ruby" :algo "transpose" :lib "Array" :id 22 :doc "https://apidock.com/ruby/Array/transpose" :sig "-"}
"APL@⍉ (transpose)@-@22" {:lang "APL" :algo "⍉ (transpose)" :lib "-" :id 22 :doc "http://microapl.com/apl_help/ch_020_020_540.htm" :sig "-"}
"F#@transpose@List@22" {:lang "F#" :algo "transpose" :lib "List" :id 22 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-listmodule.html#transpose" :sig "-"}
"F#@zip@List@28" {:lang "F#" :algo "zip" :lib "List" :id 28 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-listmodule.html#zip" :sig "-"}
"Haskell@transpose@Data.List@22" {:lang "Haskell" :algo "transpose" :lib "Data.List" :id 22 :doc "https://hackage.haskell.org/package/base-4.12.0.0/docs/Data-List.html#v:transpose" :sig "-"}
"q@flip@- @22" {:lang "q" :algo "flip" :lib "- " :id 22 :doc "https://code.kx.com/v2/ref/flip/" :sig "-"}
"Clojure@transpose@core.matrix@22" {:lang "Clojure" :algo "transpose" :lib "core.matrix" :id 22 :doc "https://mikera.github.io/core.matrix/doc/clojure.core.matrix.html#var-transpose" :sig "-"}
"Elixir@transpose@Matrix@22" {:lang "Elixir" :algo "transpose" :lib "Matrix" :id 22 :doc "https://hexdocs.pm/matrix/Matrix.html#transpose/1" :sig "-"}
"Scala@transpose@various@22" {:lang "Scala" :algo "transpose" :lib "various" :id 22 :doc "https://scala-lang.org/api/current/scala/collection/ArrayOps.html#transpose-fffff875" :sig "-"}
"D@transposed@range@22" {:lang "D" :algo "transposed" :lib "range" :id 22 :doc "https://dlang.org/library/std/range/transposed.html" :sig "-"}
"Python@transpose@RAPIDS cuDF@22" {:lang "Python" :algo "transpose" :lib "RAPIDS cuDF" :id 22 :doc "https://docs.rapids.ai/api/cudf/stable/api.html#cudf.core.dataframe.DataFrame.transpose" :sig "-"}
"Uiua@⍉ (transpose)@-@22" {:lang "Uiua" :algo "⍉ (transpose)" :lib "-" :id 22 :doc "https://www.uiua.org/docs/transpose" :sig "-"}
"APL@⊆ (partition)@-@23" {:lang "APL" :algo "⊆ (partition)" :lib "-" :id 23 :doc "http://microapl.com/apl_help/ch_020_020_590.htm" :sig "-"}
"Haskell@groupBy@Data.List.HT@23" {:lang "Haskell" :algo "groupBy" :lib "Data.List.HT" :id 23 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:groupBy" :sig "-"}
"Python@groupby@itertools@23" {:lang "Python" :algo "groupby" :lib "itertools" :id 23 :doc "https://docs.python.org/3/library/itertools.html#itertools.groupby" :sig "-"}
"Clojure@partition-by@core@23" {:lang "Clojure" :algo "partition-by" :lib "core" :id 23 :doc "https://clojuredocs.org/clojure.core/partition-by" :sig "-"}
"Ruby@chunk_while@Enumerable@23" {:lang "Ruby" :algo "chunk_while" :lib "Enumerable" :id 23 :doc "https://apidock.com/ruby/Enumerable/chunk_while" :sig "-"}
"D@chunkBy@algorith.iteration@23" {:lang "D" :algo "chunkBy" :lib "algorith.iteration" :id 23 :doc "https://dlang.org/library/std/algorithm/iteration/chunk_by.html" :sig "-"}
"Elixir@chunk_while@Enum@23" {:lang "Elixir" :algo "chunk_while" :lib "Enum" :id 23 :doc "https://hexdocs.pm/elixir/Enum.html#chunk_while/4" :sig "-"}
"Ruby@slice_when@Enumerable@23" {:lang "Ruby" :algo "slice_when" :lib "Enumerable" :id 23 :doc "https://apidock.com/ruby/v2_5_5/Enumerable/slice_when" :sig "-"}
"C++@chunk_by@range-v3@23" {:lang "C++" :algo "chunk_by" :lib "range-v3" :id 23 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "-"}
"C++@chunk_by@<ranges>@23" {:lang "C++" :algo "chunk_by" :lib "<ranges>" :id 23 :doc "https://en.cppreference.com/w/cpp/ranges/chunk_by_view" :sig "-"}
"Uiua@⊜ (partition)@-@23" {:lang "Uiua" :algo "⊜ (partition)" :lib "-" :id 23 :doc "https://www.uiua.org/docs/partition" :sig "-"}
"Haskell@repeat@Prelude@24" {:lang "Haskell" :algo "repeat" :lib "Prelude" :id 24 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/Prelude.html#v:repeat" :sig "-"}
"Clojure@repeat@core@24" {:lang "Clojure" :algo "repeat" :lib "core" :id 24 :doc "https://clojuredocs.org/clojure.core/repeat" :sig "-"}
"C++@repeat@range-v3@24" {:lang "C++" :algo "repeat" :lib "range-v3" :id 24 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "-"}
"D@repeat@range@24" {:lang "D" :algo "repeat" :lib "range" :id 24 :doc "https://dlang.org/library/std/range/repeat.html" :sig "-"}
"Rust@repeat@Iter@24" {:lang "Rust" :algo "repeat" :lib "Iter" :id 24 :doc "https://doc.rust-lang.org/std/iter/struct.Repeat.html" :sig "-"}
"Haskell@replicate@Prelude@25" {:lang "Haskell" :algo "replicate" :lib "Prelude" :id 25 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/Prelude.html#v:replicate" :sig "-"}
"C++@repeat_n@range-v3@25" {:lang "C++" :algo "repeat_n" :lib "range-v3" :id 25 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "-"}
"C#@repeat@Enumerable@25" {:lang "C#" :algo "repeat" :lib "Enumerable" :id 25 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.repeat?view=netcore-3.1" :sig "-"}
"APL@\\ (expand)@-@25" {:lang "APL" :algo "\\ (expand)" :lib "-" :id 25 :doc "http://microapl.com/apl_help/ch_020_020_860.htm" :sig "-"}
"C++@transform*@<algorithm>@30" {:lang "C++" :algo "transform*" :lib "<algorithm>" :id 30 :doc "https://en.cppreference.com/w/cpp/algorithm/transform" :sig "-"}
"Haskell@zipWith@Prelude@30" {:lang "Haskell" :algo "zipWith" :lib "Prelude" :id 30 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/Prelude.html#v:zipWith" :sig "-"}
"Clojure@map*@core@30" {:lang "Clojure" :algo "map*" :lib "core" :id 30 :doc "https://clojuredocs.org/clojure.core/map" :sig "-"}
"Racket@map*@base@30" {:lang "Racket" :algo "map*" :lib "base" :id 30 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Fprivate%2Fmap..rkt%29._map%29%29" :sig "-"}
"OCaml@map2@List@30" {:lang "OCaml" :algo "map2" :lib "List" :id 30 :doc "https://caml.inria.fr/pub/docs/manual-ocaml/libref/List.html" :sig "-"}
"F#@map2@Seq@30" {:lang "F#" :algo "map2" :lib "Seq" :id 30 :doc "https://msdn.microsoft.com/visualfsharpdocs/conceptual/list.map2%5b%27t1%2c%27t2%2c%27u%5d-function-%5bfsharp%5d" :sig "-"}
"C++@filter@range-v3@3" {:lang "C++" :algo "filter" :lib "range-v3" :id 3 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "-"}
"C#@Where@Enumerable@3" {:lang "C#" :algo "Where" :lib "Enumerable" :id 3 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.where?view=netcore-3.1" :sig "-"}
"J@copy@-@3" {:lang "J" :algo "copy" :lib "-" :id 3 :doc "https://code.jsoftware.com/wiki/Vocabulary/number#dyadic" :sig "-"}
"Java@filter@Streams@3" {:lang "Java" :algo "filter" :lib "Streams" :id 3 :doc "https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#filter-java.util.function.Predicate-" :sig "-"}
"OCaml@filter@List@3" {:lang "OCaml" :algo "filter" :lib "List" :id 3 :doc "https://ocaml.org/releases/4.10/htmlman/libref/List.html" :sig "-"}
"Clojure@filter@core@3" {:lang "Clojure" :algo "filter" :lib "core" :id 3 :doc "https://clojuredocs.org/clojure.core/filter" :sig "-"}
"Racket@filter@base@3" {:lang "Racket" :algo "filter" :lib "base" :id 3 :doc "https://docs.racket-lang.org/reference/pairs.html?q=filter#%28def._%28%28lib._racket%2Fprivate%2Flist..rkt%29._filter%29%29" :sig "-"}
"F#@filter@List@3" {:lang "F#" :algo "filter" :lib "List" :id 3 :doc "https://msdn.microsoft.com/visualfsharpdocs/conceptual/list.filter%5b%27t%5d-function-%5bfsharp%5d" :sig "-"}
"D@filter@algorithm@3" {:lang "D" :algo "filter" :lib "algorithm" :id 3 :doc "https://dlang.org/library/std/algorithm/iteration/filter.html" :sig "-"}
"Ruby@filter@Array@3" {:lang "Ruby" :algo "filter" :lib "Array" :id 3 :doc "https://apidock.com/ruby/Array/filter" :sig "-"}
"Python@filter@-@3" {:lang "Python" :algo "filter" :lib "-" :id 3 :doc "https://docs.python.org/3/library/functions.html#filter" :sig "-"}
"Kotlin@filter@collections@3" {:lang "Kotlin" :algo "filter" :lib "collections" :id 3 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html" :sig "-"}
"Scala@filter@various@3" {:lang "Scala" :algo "filter" :lib "various" :id 3 :doc "https://scala-lang.org/api/current/scala/collection/ArrayOps.html#filter-c24" :sig "-"}
"Rust@filter@iter@3" {:lang "Rust" :algo "filter" :lib "iter" :id 3 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.filter" :sig "-"}
"Elixir@filter@Enum@3" {:lang "Elixir" :algo "filter" :lib "Enum" :id 3 :doc "https://hexdocs.pm/elixir/Enum.html#filter/2" :sig "-"}
"D@cartesianProduct@std.algorithm.setops@100" {:lang "D" :algo "cartesianProduct" :lib "std.algorithm.setops" :id 100 :doc "https://dlang.org/library/std/algorithm/setops/cartesian_product.html" :sig "-"}
"D@dotProduct@std.numeric@7" {:lang "D" :algo "dotProduct" :lib "std.numeric" :id 7 :doc "https://dlang.org/library/std/numeric/dot_product.html" :sig "-"}
"C++@cartesian_product@range-v3@100" {:lang "C++" :algo "cartesian_product" :lib "range-v3" :id 100 :doc "https://ericniebler.github.io/range-v3/index.html#tutorial-views" :sig "-"}
"Python@product@itertools@100" {:lang "Python" :algo "product" :lib "itertools" :id 100 :doc "https://docs.python.org/3/library/itertools.html#itertools.product" :sig "-"}
"q@cross@-@100" {:lang "q" :algo "cross" :lib "-" :id 100 :doc "https://code.kx.com/q4m3/A_Built-in_Functions/#a18-cross" :sig "-"}
"J@. (Matrix Product)@-@7" {:lang "J" :algo ". (Matrix Product)" :lib "-" :id 7 :doc "https://code.jsoftware.com/wiki/Vocabulary/dot#dyadic" :sig "-"}
"R@outer@-@6" {:lang "R" :algo "outer" :lib "-" :id 6 :doc "https://www.rdocumentation.org/packages/base/versions/3.6.2/topics/outer" :sig "-"}
"Ruby@product@Array@100" {:lang "Ruby" :algo "product" :lib "Array" :id 100 :doc "https://apidock.com/ruby/Array/product" :sig "-"}
"Racket@cartesian-product@base@100" {:lang "Racket" :algo "cartesian-product" :lib "base" :id 100 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Flist..rkt%29._cartesian-product%29%29" :sig "-"}
"Rust@cartesian_product@trait.itertools@100" {:lang "Rust" :algo "cartesian_product" :lib "trait.itertools" :id 100 :doc "https://docs.rs/itertools/0.8.2/itertools/trait.Itertools.html#method.cartesian_product" :sig "-"}
"C++@all_of@<algorithm>@31" {:lang "C++" :algo "all_of" :lib "<algorithm>" :id 31 :doc "https://en.cppreference.com/w/cpp/algorithm/all_any_none_of" :sig "-"}
"Haskell@all@Prelude@31" {:lang "Haskell" :algo "all" :lib "Prelude" :id 31 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/GHC-List.html#v:all" :sig "-"}
"Clojure@every?@core@31" {:lang "Clojure" :algo "every?" :lib "core" :id 31 :doc "https://clojuredocs.org/clojure.core/every_q" :sig "-"}
"Kotlin@all@sequences@31" {:lang "Kotlin" :algo "all" :lib "sequences" :id 31 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/all.html" :sig "-"}
"Rust@all@iter@31" {:lang "Rust" :algo "all" :lib "iter" :id 31 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.all" :sig "-"}
"Scala@forall@various@31" {:lang "Scala" :algo "forall" :lib "various" :id 31 :doc "https://scala-lang.org/api/current/scala/collection/IterableOnceOps.html#forall-fffff66f" :sig "-"}
"Elixir@all?@Enum@31" {:lang "Elixir" :algo "all?" :lib "Enum" :id 31 :doc "https://hexdocs.pm/elixir/Enum.html#all?/2" :sig "-"}
"Python@all@-@31" {:lang "Python" :algo "all" :lib "-" :id 31 :doc "https://docs.python.org/3/library/functions.html#all" :sig "-"}
"Ruby@all@Enumerable@31" {:lang "Ruby" :algo "all" :lib "Enumerable" :id 31 :doc "https://apidock.com/ruby/Enumerable/all%3F" :sig "-"}
"Java@allMatch@Streams@31" {:lang "Java" :algo "allMatch" :lib "Streams" :id 31 :doc "https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#allMatch-java.util.function.Predicate-" :sig "-"}
"D@all@std.algorithm@31" {:lang "D" :algo "all" :lib "std.algorithm" :id 31 :doc "https://dlang.org/library/std/algorithm/searching/all.all.html" :sig "-"}
"Swift@allSatisfy@@31" {:lang "Swift" :algo "allSatisfy" :lib "" :id 31 :doc "https://developer.apple.com/documentation/swift/array/2994715-allsatisfy" :sig "-"}
"OCaml@for_all@List@31" {:lang "OCaml" :algo "for_all" :lib "List" :id 31 :doc "https://caml.inria.fr/pub/docs/manual-ocaml/libref/List.html" :sig "-"}
"C#@All@Linq@31" {:lang "C#" :algo "All" :lib "Linq" :id 31 :doc "https://docs.microsoft.com/en-us/dotnet/api/system.linq.enumerable.all?view=netcore-3.1" :sig "-"}
"JavaScript@every@@31" {:lang "JavaScript" :algo "every" :lib "" :id 31 :doc "https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/every" :sig "-"}
"Elm@all@List@31" {:lang "Elm" :algo "all" :lib "List" :id 31 :doc "https://package.elm-lang.org/packages/elm/core/latest/List#all" :sig "-"}
"Julia@all@Base@31" {:lang "Julia" :algo "all" :lib "Base" :id 31 :doc "https://docs.julialang.org/en/v1/base/collections/#Base.all-Tuple{AbstractArray,Any}" :sig "-"}
"Haskell@++@Prelude@42" {:lang "Haskell" :algo "++" :lib "Prelude" :id 42 :doc "https://hackage.haskell.org/package/base-4.14.0.0/docs/Prelude.html#v:-43--43-" :sig "-"}
"Racket@append@base@42" {:lang "Racket" :algo "append" :lib "base" :id 42 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28quote._~23~25kernel%29._append%29%29" :sig "-"}
"Python@append@list@42" {:lang "Python" :algo "append" :lib "list" :id 42 :doc "https://docs.python.org/3/tutorial/introduction.html#lists" :sig "-"}
"Clojure@concat@List@42" {:lang "Clojure" :algo "concat" :lib "List" :id 42 :doc "https://clojuredocs.org/clojure.core/concat" :sig "-"}
"C++@join@Ranges@42" {:lang "C++" :algo "join" :lib "Ranges" :id 42 :doc "https://en.cppreference.com/w/cpp/ranges" :sig "-"}
"Swift@+@Array@42" {:lang "Swift" :algo "+" :lib "Array" :id 42 :doc "https://developer.apple.com/documentation/swift/array/2963457" :sig "-"}
"Rust@chain@iter@42" {:lang "Rust" :algo "chain" :lib "iter" :id 42 :doc "https://doc.rust-lang.org/std/iter/trait.Iterator.html#method.chain" :sig "-"}
"Python@chain@itertools@42" {:lang "Python" :algo "chain" :lib "itertools" :id 42 :doc "https://docs.python.org/3/library/itertools.html#itertools.chain" :sig "-"}
"Julia@vcat@Base@42" {:lang "Julia" :algo "vcat" :lib "Base" :id 42 :doc "https://docs.julialang.org/en/v1/base/arrays/#Base.vcat" :sig "-"}
"Elixir@concat@Enum@42" {:lang "Elixir" :algo "concat" :lib "Enum" :id 42 :doc "https://hexdocs.pm/elixir/Enum.html#concat/2" :sig "-"}
"Elixir@++@Kernel@42" {:lang "Elixir" :algo "++" :lib "Kernel" :id 42 :doc "https://hexdocs.pm/elixir/Kernel.html#++/2" :sig "-"}
"F#@allPairs@List@100" {:lang "F#" :algo "allPairs" :lib "List" :id 100 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-listmodule.html#allPairs" :sig "-"}
"Julia@product@IterTools@100" {:lang "Julia" :algo "product" :lib "IterTools" :id 100 :doc "https://juliacollections.github.io/IterTools.jl/v0.2.1/#product(xs...)-1" :sig "-"}
"APL@,∘.,@@100" {:lang "APL" :algo ",∘.," :lib "" :id 100 :doc "" :sig "-"}
"SQL@CROSS JOIN@@100" {:lang "SQL" :algo "CROSS JOIN" :lib "" :id 100 :doc "https://www.w3resource.com/sql/joins/cross-join.php" :sig "-"}
"Python@all_equal@more-itertools@51" {:lang "Python" :algo "all_equal" :lib "more-itertools" :id 51 :doc "https://more-itertools.readthedocs.io/en/stable/api.html#more_itertools.all_equal" :sig "-"}
"Clojure@apply = @@51" {:lang "Clojure" :algo "apply = " :lib "" :id 51 :doc "" :sig "-"}
"Racket@apply = @@51" {:lang "Racket" :algo "apply = " :lib "" :id 51 :doc "" :sig "-"}
"Haskell@allEqual@Data.List.HT@51" {:lang "Haskell" :algo "allEqual" :lib "Data.List.HT" :id 51 :doc "https://hackage.haskell.org/package/utility-ht-0.0.15/docs/Data-List-HT.html#v:allEqual" :sig "-"}
"JavaScript@allEqual@bbo@51" {:lang "JavaScript" :algo "allEqual" :lib "bbo" :id 51 :doc "https://tnfe.github.io/bbo/#allequal" :sig "-"}
"C++@rotate@<algorithm>@4104" {:lang "C++" :algo "rotate" :lib "<algorithm>" :id 4104 :doc "https://en.cppreference.com/w/cpp/algorithm/rotate" :sig "-"}
"F#@permute@various@4104" {:lang "F#" :algo "permute" :lib "various" :id 4104 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-arraymodule.html#permute" :sig "-"}
"APL@⌽ (rotate)@@4104" {:lang "APL" :algo "⌽ (rotate)" :lib "" :id 4104 :doc "https://microapl.com/apl_help/ch_020_020_520.htm" :sig "-"}
"Ruby@rotate@Array@4104" {:lang "Ruby" :algo "rotate" :lib "Array" :id 4104 :doc "https://apidock.com/ruby/v2_5_5/Array/rotate" :sig "-"}
"Rust@rotate_left@Slice@4104" {:lang "Rust" :algo "rotate_left" :lib "Slice" :id 4104 :doc "https://doc.rust-lang.org/stable/std/primitive.slice.html#method.rotate_left" :sig "-"}
"Julia@circshift@@4104" {:lang "Julia" :algo "circshift" :lib "" :id 4104 :doc "https://docs.julialang.org/en/v1/base/arrays/#Base.circshift" :sig "-"}
"q@rotate@Core@4104" {:lang "q" :algo "rotate" :lib "Core" :id 4104 :doc "https://code.kx.com/q4m3/A_Built-in_Functions/#a79-rotate" :sig "-"}
"Uiua@↻ (rotate)@-@4104" {:lang "Uiua" :algo "↻ (rotate)" :lib "-" :id 4104 :doc "https://www.uiua.org/docs/rotate" :sig "-"}
"Rust@dedup@itertools@15" {:lang "Rust" :algo "dedup" :lib "itertools" :id 15 :doc "https://docs.rs/itertools/0.7.6/itertools/structs/struct.Dedup.html" :sig "-"}
"Racket@remove-duplicates@@15" {:lang "Racket" :algo "remove-duplicates" :lib "" :id 15 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket/list..rkt%29._remove-duplicates%29%29" :sig "-"}
"OCaml@sort_uniq@List@15" {:lang "OCaml" :algo "sort_uniq" :lib "List" :id 15 :doc "https://ocaml.org/api/List.html#VALsort_uniq" :sig "-"}
"Elm@dedup@List@14" {:lang "Elm" :algo "dedup" :lib "List" :id 14 :doc "https://package.elm-lang.org/packages/mgold/elm-nonempty-list/latest/List-Nonempty#dedup" :sig "-"}
"Elm@uniq@List@15" {:lang "Elm" :algo "uniq" :lib "List" :id 15 :doc "https://package.elm-lang.org/packages/mgold/elm-nonempty-list/latest/List-Nonempty#uniq" :sig "-"}
"F#@distinct@Seq@15" {:lang "F#" :algo "distinct" :lib "Seq" :id 15 :doc "https://fsharp.github.io/fsharp-core-docs/reference/fsharp-collections-seqmodule.html#distinct" :sig "-"}
"Pharo@removeDuplicates@OrderedCollection@15" {:lang "Pharo" :algo "removeDuplicates" :lib "OrderedCollection" :id 15 :doc "" :sig "-"}
"BQN@ ` (scan) @-@4" {:lang "BQN" :algo " ` (scan) " :lib "-" :id 4 :doc "https://mlochbaum.github.io/BQN/help/scan.html" :sig "-"}
"BQN@˝ (insert)@-@1" {:lang "BQN" :algo "˝ (insert)" :lib "-" :id 1 :doc "https://mlochbaum.github.io/BQN/help/insert.html" :sig "-"}
"Kotlin@fold@collections@1" {:lang "Kotlin" :algo "fold" :lib "collections" :id 1 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/fold.html" :sig "-"}
"Kotlin@runningFold@collections@4" {:lang "Kotlin" :algo "runningFold" :lib "collections" :id 4 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/running-fold.html" :sig "-"}
"D@fold@algorithm.iteration@1" {:lang "D" :algo "fold" :lib "algorithm.iteration" :id 1 :doc "https://dlang.org/library/std/algorithm/iteration/fold.html" :sig "-"}
"Scala@fold@various@1" {:lang "Scala" :algo "fold" :lib "various" :id 1 :doc "https://scala-lang.org/api/current/scala/collection/IterableOnceOps.html#fold-fffff9e1" :sig "-"}
"Scala@reduce@various@1" {:lang "Scala" :algo "reduce" :lib "various" :id 1 :doc "https://scala-lang.org/api/current/scala/collection/IterableOnceOps.html#reduce-fffff3d4" :sig "-"}
"Ruby@inject@Enumerable@1" {:lang "Ruby" :algo "inject" :lib "Enumerable" :id 1 :doc "https://apidock.com/ruby/Enumerable/inject" :sig "-"}
"Pharo@inject:into:@Collection@1" {:lang "Pharo" :algo "inject:into:" :lib "Collection" :id 1 :doc "" :sig "-"}
"Pharo@reduce:@Collection@1" {:lang "Pharo" :algo "reduce:" :lib "Collection" :id 1 :doc "" :sig "-"}
"Pharo@fold:@Collection@1" {:lang "Pharo" :algo "fold:" :lib "Collection" :id 1 :doc "" :sig "-"}
"BQN@´ (fold)@-@1" {:lang "BQN" :algo "´ (fold)" :lib "-" :id 1 :doc "https://mlochbaum.github.io/BQN/help/fold.html" :sig "-"}
"APL@⌿ (reduce first)@-@1" {:lang "APL" :algo "⌿ (reduce first)" :lib "-" :id 1 :doc "https://microapl.com/apl_help/ch_020_020_810.htm" :sig "-"}
"BQN@⌜ (table)@-@6" {:lang "BQN" :algo "⌜ (table)" :lib "-" :id 6 :doc "https://mlochbaum.github.io/BQN/help/table.html" :sig "-"}
"J@/ (table)@-@6" {:lang "J" :algo "/ (table)" :lib "-" :id 6 :doc "https://code.jsoftware.com/wiki/Vocabulary/slash#dyadic" :sig "-"}
"Rust@counts@Itertools@19" {:lang "Rust" :algo "counts" :lib "Itertools" :id 19 :doc "https://docs.rs/itertools/latest/itertools/trait.Itertools.html#method.counts" :sig "-"}
"C++@adjacent_transform@<ranges>@5" {:lang "C++" :algo "adjacent_transform" :lib "<ranges>" :id 5 :doc "https://en.cppreference.com/w/cpp/ranges/adjacent_transform_view" :sig "-"}
"Gleam@map@list@2" {:lang "Gleam" :algo "map" :lib "list" :id 2 :doc "https://hexdocs.pm/gleam_stdlib/gleam/list.html#map" :sig "-"}
"Gleam@range@list@8" {:lang "Gleam" :algo "range" :lib "list" :id 8 :doc "https://hexdocs.pm/gleam_stdlib/gleam/list.html#range" :sig "-"}
"Gleam@map2@list@30" {:lang "Gleam" :algo "map2" :lib "list" :id 30 :doc "https://hexdocs.pm/gleam_stdlib/gleam/list.html#map2" :sig "-"}
"Gleam@scan@list@4" {:lang "Gleam" :algo "scan" :lib "list" :id 4 :doc "https://hexdocs.pm/gleam_stdlib/gleam/list.html#scan" :sig "-"}
"Kap@⌻ (outer product)@-@6" {:lang "Kap" :algo "⌻ (outer product)" :lib "-" :id 6 :doc "https://kapdemo.dhsdevelopments.com/reference.html#_outer_product" :sig "-"}
"Uiua@⊞ (table)@-@6" {:lang "Uiua" :algo "⊞ (table)" :lib "-" :id 6 :doc "https://www.uiua.org/docs/table" :sig "-"}
"Common Lisp@reduce@-@1" {:lang "Common Lisp" :algo "reduce" :lib "-" :id 1 :doc "https://novaspec.org/cl/f_reduce" :sig "-"}
"Common Lisp@map@-@2" {:lang "Common Lisp" :algo "map" :lib "-" :id 2 :doc "https://novaspec.org/cl/f_map" :sig "-"}
"Mathematica@Fold@-@1" {:lang "Mathematica" :algo "Fold" :lib "-" :id 1 :doc "https://reference.wolfram.com/language/ref/Fold.html" :sig "-"}
"Mathematica@/@ (Map)@-@2" {:lang "Mathematica" :algo "/@ (Map)" :lib "-" :id 2 :doc "http://reference.wolfram.com/language/ref/Map.html" :sig "-"}
"Mathematica@Select@-@3" {:lang "Mathematica" :algo "Select" :lib "-" :id 3 :doc "http://reference.wolfram.com/language/ref/Select.html" :sig "-"}
"Mathematica@FoldList@-@4" {:lang "Mathematica" :algo "FoldList" :lib "-" :id 4 :doc "http://reference.wolfram.com/language/ref/FoldList.html" :sig "-"}
"Mathematica@Outer@-@6" {:lang "Mathematica" :algo "Outer" :lib "-" :id 6 :doc "http://reference.wolfram.com/language/ref/Outer.html" :sig "-"}
"Mathematica@Inner@-@7" {:lang "Mathematica" :algo "Inner" :lib "-" :id 7 :doc "http://reference.wolfram.com/language/ref/Inner.html" :sig "-"}
"Mathematica@Range@-@8" {:lang "Mathematica" :algo "Range" :lib "-" :id 8 :doc "http://reference.wolfram.com/language/ref/Range.html" :sig "-"}
"Mathematica@Partition@-@11" {:lang "Mathematica" :algo "Partition" :lib "-" :id 11 :doc "http://reference.wolfram.com/language/ref/Partition.html" :sig "-"}
"Mathematica@DeleteAdjacentDuplicates@-@14" {:lang "Mathematica" :algo "DeleteAdjacentDuplicates" :lib "-" :id 14 :doc "http://reference.wolfram.com/language/ref/DeleteAdjacentDuplicates.html" :sig "-"}
"Mathematica@DeleteDuplicates@-@15" {:lang "Mathematica" :algo "DeleteDuplicates" :lib "-" :id 15 :doc "http://reference.wolfram.com/language/ref/DeleteDuplicates.html" :sig "-"}
"Mathematica@ToString@-@16" {:lang "Mathematica" :algo "ToString" :lib "-" :id 16 :doc "http://reference.wolfram.com/language/ref/ToString.html" :sig "-"}
"Mathematica@MemberQ@-@17" {:lang "Mathematica" :algo "MemberQ" :lib "-" :id 17 :doc "http://reference.wolfram.com/language/ref/MemberQ.html" :sig "-"}
"Mathematica@Counts@-@19" {:lang "Mathematica" :algo "Counts" :lib "-" :id 19 :doc "http://reference.wolfram.com/language/ref/Counts.html" :sig "-"}
"Mathematica@AnyTrue@-@20" {:lang "Mathematica" :algo "AnyTrue" :lib "-" :id 20 :doc "http://reference.wolfram.com/language/ref/AnyTrue.html" :sig "-"}
"Mathematica@Join@-@21" {:lang "Mathematica" :algo "Join" :lib "-" :id 21 :doc "http://reference.wolfram.com/language/ref/Join.html" :sig "-"}
"Mathematica@StringJoin@-@21" {:lang "Mathematica" :algo "StringJoin" :lib "-" :id 21 :doc "http://reference.wolfram.com/language/ref/StringJoin.html" :sig "-"}
"Mathematica@Catenate@-@21" {:lang "Mathematica" :algo "Catenate" :lib "-" :id 21 :doc "http://reference.wolfram.com/language/ref/Catenate.html" :sig "-"}
"Mathematica@Transpose@-@22" {:lang "Mathematica" :algo "Transpose" :lib "-" :id 22 :doc "http://reference.wolfram.com/language/ref/Transpose.html" :sig "-"}
"Mathematica@SplitBy@-@23" {:lang "Mathematica" :algo "SplitBy" :lib "-" :id 23 :doc "http://reference.wolfram.com/language/ref/SplitBy.html" :sig "-"}
"Mathematica@ConstantArray@-@25" {:lang "Mathematica" :algo "ConstantArray" :lib "-" :id 25 :doc "http://reference.wolfram.com/language/ref/ConstantArray.html" :sig "-"}
"Mathematica@MapThread@-@30" {:lang "Mathematica" :algo "MapThread" :lib "-" :id 30 :doc "http://reference.wolfram.com/language/ref/MapThread.html" :sig "-"}
"Mathematica@AllTrue@-@31" {:lang "Mathematica" :algo "AllTrue" :lib "-" :id 31 :doc "http://reference.wolfram.com/language/ref/AllTrue.html" :sig "-"}
"Mathematica@Append@-@42" {:lang "Mathematica" :algo "Append" :lib "-" :id 42 :doc "http://reference.wolfram.com/language/ref/Append.html" :sig "-"}
"Mathematica@AppendTo@-@42" {:lang "Mathematica" :algo "AppendTo" :lib "-" :id 42 :doc "http://reference.wolfram.com/language/ref/AppendTo.html" :sig "-"}
"Mathematica@RotateLeft@-@4104" {:lang "Mathematica" :algo "RotateLeft" :lib "-" :id 4104 :doc "http://reference.wolfram.com/language/ref/RotateLeft.html" :sig "-"}
"Mathematica@RotateRight@-@4104" {:lang "Mathematica" :algo "RotateRight" :lib "-" :id 4104 :doc "http://reference.wolfram.com/language/ref/RotateRight.html" :sig "-"}
"Common Lisp@every@-@31" {:lang "Common Lisp" :algo "every" :lib "-" :id 31 :doc "https://novaspec.org/cl/f_every" :sig "-"}
"Common Lisp@remove-duplicates@-@15" {:lang "Common Lisp" :algo "remove-duplicates" :lib "-" :id 15 :doc "https://novaspec.org/cl/f_remove-duplicates" :sig "-"}
"Common Lisp@apply@-@51" {:lang "Common Lisp" :algo "apply" :lib "-" :id 51 :doc "https://novaspec.org/cl/f_apply" :sig "-"}
"Haskell@intersperse@Data.List@12" {:lang "Haskell" :algo "intersperse" :lib "Data.List" :id 12 :doc "https://hackage.haskell.org/package/base/docs/Data-List.html#v:intersperse" :sig "-"}
"Rust@intersperse@itertools@12" {:lang "Rust" :algo "intersperse" :lib "itertools" :id 12 :doc "https://docs.rs/itertools/0.14.0/itertools/fn.intersperse.html" :sig "-"}
"Gleam@intersperse@list@12" {:lang "Gleam" :algo "intersperse" :lib "list" :id 12 :doc "https://hexdocs.pm/gleam_stdlib/gleam/list.html#intersperse" :sig "-"}
"Elixir@intersperse@Enum@12" {:lang "Elixir" :algo "intersperse" :lib "Enum" :id 12 :doc "https://hexdocs.pm/elixir/1.12/Enum.html#intersperse/2" :sig "-"}
"Racket@intersperse@seq@12" {:lang "Racket" :algo "intersperse" :lib "seq" :id 12 :doc "https://docs.racket-lang.org/seq/index.html#%28def._%28%28lib._seq%2Fmain..rkt%29._intersperse%29%29" :sig "-"}
"Racket@add-between@@12" {:lang "Racket" :algo "add-between" :lib "" :id 12 :doc "https://docs.racket-lang.org/reference/pairs.html#%28def._%28%28lib._racket%2Flist..rkt%29._add-between%29%29" :sig "-"}
"Elm@intersperse@core@12" {:lang "Elm" :algo "intersperse" :lib "core" :id 12 :doc "https://package.elm-lang.org/packages/elm/core/latest/List#intersperse" :sig "-"}
"Agda@foldl@various@1" {:lang "Agda" :algo "foldl" :lib "various" :id 1 :doc "https://agda.github.io/agda-stdlib/v2.2/Effect.Foldable.html#1843" :sig "-"}
"Agda@map@various@2" {:lang "Agda" :algo "map" :lib "various" :id 2 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#1634" :sig "-"}
"Agda@filter@various@3" {:lang "Agda" :algo "filter" :lib "various" :id 3 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#10687" :sig "-"}
"Agda@scanl@various@4" {:lang "Agda" :algo "scanl" :lib "various" :id 4 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Scans.Base.html#1105" :sig "-"}
"Agda@cartesianProductWith@Data.List@26" {:lang "Agda" :algo "cartesianProductWith" :lib "Data.List" :id 26 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#2132" :sig "-"}
"Agda@cartesianProduct@Data.List@100" {:lang "Agda" :algo "cartesianProduct" :lib "Data.List" :id 100 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#2317" :sig "-"}
"Agda@upTo@Data.List@8" {:lang "Agda" :algo "upTo" :lib "Data.List" :id 8 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#6689" :sig "-"}
"Agda@allFin@Data.Vec@8" {:lang "Agda" :algo "allFin" :lib "Data.Vec" :id 8 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.Vec.Base.html#6708" :sig "-"}
"Agda@partitionᵇ@Data.List@10" {:lang "Agda" :algo "partitionᵇ" :lib "Data.List" :id 10 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#11170" :sig "-"}
"Agda@intersperse@Data.List@12" {:lang "Agda" :algo "intersperse" :lib "Data.List" :id 12 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#1819" :sig "-"}
"Agda@group@Data.Vec@13" {:lang "Agda" :algo "group" :lib "Data.Vec" :id 13 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.Vec.Base.html#7275" :sig "-"}
"Agda@deduplicate@Data.List@15" {:lang "Agda" :algo "deduplicate" :lib "Data.List" :id 15 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#13320" :sig "-"}
"Agda@show@various@16" {:lang "Agda" :algo "show" :lib "various" :id 16 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.Bool.Show.html#412" :sig "-"}
"Agda@_∈_@Data.List@17" {:lang "Agda" :algo "_∈_" :lib "Data.List" :id 17 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Membership.Setoid.html#925" :sig "-"}
"Agda@any@various@20" {:lang "Agda" :algo "any" :lib "various" :id 20 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#4857" :sig "-"}
"Agda@concat@various@21" {:lang "Agda" :algo "concat" :lib "various" :id 21 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#4350" :sig "-"}
"Agda@transpose@various@22" {:lang "Agda" :algo "transpose" :lib "various" :id 22 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.Vec.Base.html#9519" :sig "-"}
"Agda@repeat@Codata.Guarded.Stream@24" {:lang "Agda" :algo "repeat" :lib "Codata.Guarded.Stream" :id 24 :doc "https://agda.github.io/agda-stdlib/v2.2/Codata.Guarded.Stream.html#1216" :sig "-"}
"Agda@replicate@various@25" {:lang "Agda" :algo "replicate" :lib "various" :id 25 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#5319" :sig "-"}
"Agda@zipWith@various@30" {:lang "Agda" :algo "zipWith" :lib "various" :id 30 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#2734" :sig "-"}
"Agda@all@various@31" {:lang "Agda" :algo "all" :lib "various" :id 31 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#4910" :sig "-"}
"Agda@_++_@various@42" {:lang "Agda" :algo "_++_" :lib "various" :id 42 :doc "https://agda.github.io/agda-stdlib/v2.2/Data.List.Base.html#1734" :sig "-"}
"Kap@⍸ (where)@-@18" {:lang "Kap" :algo "⍸ (where)" :lib "-" :id 18 :doc "" :sig "-"}
"BQN@/ (indices)@-@18" {:lang "BQN" :algo "/ (indices)" :lib "-" :id 18 :doc "https://mlochbaum.github.io/BQN/doc/replicate.html#indices" :sig "-"}
"Uiua@⊚ (where)@-@18" {:lang "Uiua" :algo "⊚ (where)" :lib "-" :id 18 :doc "https://www.uiua.org/docs/where" :sig "-"}
"J@I. (indices)@-@18" {:lang "J" :algo "I. (indices)" :lib "-" :id 18 :doc "https://code.jsoftware.com/wiki/Vocabulary/icapdot" :sig "-"}
"Python@where@NumPy@18" {:lang "Python" :algo "where" :lib "NumPy" :id 18 :doc "https://numpy.org/doc/stable/reference/generated/numpy.where.html" :sig "-"}
"BQN@⍷ (deduplicate)@-@15" {:lang "BQN" :algo "⍷ (deduplicate)" :lib "-" :id 15 :doc "https://mlochbaum.github.io/BQN/doc/selfcmp.html#deduplicate" :sig "-"}
"Scala@sliding@various@27" {:lang "Scala" :algo "sliding" :lib "various" :id 27 :doc "https://scala-lang.org/api/current/scala/collection/IterableOps.html#sliding-fffffbef" :sig "-"}
"C++@sliding@<ranges>@27" {:lang "C++" :algo "sliding" :lib "<ranges>" :id 27 :doc "https://en.cppreference.com/w/cpp/ranges/slide_view" :sig "-"}
"Scala@partition@various@10" {:lang "Scala" :algo "partition" :lib "various" :id 10 :doc "https://scala-lang.org/api/current/scala/collection/Iterator.html#partition-243" :sig "-"}
"Scala@grouped@various@11" {:lang "Scala" :algo "grouped" :lib "various" :id 11 :doc "https://scala-lang.org/api/current/scala/collection/ArrayOps.html#grouped-fffffbef" :sig "-"}
"Scala@flatten@various@21" {:lang "Scala" :algo "flatten" :lib "various" :id 21 :doc "https://scala-lang.org/api/current/scala/collection/IterableOnceOps.html#flatten-5d3" :sig "-"}
"Scala@mkString@various@21" {:lang "Scala" :algo "mkString" :lib "various" :id 21 :doc "https://scala-lang.org/api/current/scala/collection/IterableOnceExtensionMethods.html#mkString-0" :sig "-"}
"Scala@continually@LazyList@24" {:lang "Scala" :algo "continually" :lib "LazyList" :id 24 :doc "https://scala-lang.org/api/current/scala/collection/immutable/LazyList$.html#continually-fffff347" :sig "-"}
"Scala@tabulate@various@25" {:lang "Scala" :algo "tabulate" :lib "various" :id 25 :doc "https://scala-lang.org/api/current/scala/Array$.html#tabulate-fffffde9" :sig "-"}
"Scala@appendedAll@various@42" {:lang "Scala" :algo "appendedAll" :lib "various" :id 42 :doc "https://scala-lang.org/api/current/scala/collection/immutable/IndexedSeqOps.html#appendedAll-1dd" :sig "-"}
"Scala@++@various@42" {:lang "Scala" :algo "++" :lib "various" :id 42 :doc "https://scala-lang.org/api/current/scala/collection/ArrayOps.html#++-fffff738" :sig "-"}
"Python@outer@Numpy@6" {:lang "Python" :algo "outer" :lib "Numpy" :id 6 :doc "https://numpy.org/doc/stable/reference/generated/numpy.outer.html" :sig "-"}
"Excel@sequence@-@8" {:lang "Excel" :algo "sequence" :lib "-" :id 8 :doc "https://exceljet.net/functions/sequence-function" :sig "-"}
"Excel@map@-@2" {:lang "Excel" :algo "map" :lib "-" :id 2 :doc "https://support.microsoft.com/en-us/office/map-function-48006093-f97c-47c1-bfcc-749263bb1f01" :sig "-"}
"Excel@reduce@-@1" {:lang "Excel" :algo "reduce" :lib "-" :id 1 :doc "https://support.microsoft.com/en-us/office/reduce-function-42e39910-b345-45f3-84b8-0642b568b7cb" :sig "-"}
"Excel@scan@-@4" {:lang "Excel" :algo "scan" :lib "-" :id 4 :doc "https://support.microsoft.com/en-us/office/scan-function-d58dfd11-9969-4439-b2dc-e7062724de29" :sig "-"}
"Excel@filter@-@3" {:lang "Excel" :algo "filter" :lib "-" :id 3 :doc "https://support.microsoft.com/en-us/office/filter-function-f4f7cb66-82eb-4767-8f7c-4877ad80c759" :sig "-"}
"Excel@unique@-@15" {:lang "Excel" :algo "unique" :lib "-" :id 15 :doc "https://support.microsoft.com/en-us/office/unique-function-c5ab87fd-30a3-4ce9-9d1a-40204fb85e1e" :sig "-"}
"Excel@arraytotext@-@16" {:lang "Excel" :algo "arraytotext" :lib "-" :id 16 :doc "https://support.microsoft.com/en-us/office/arraytotext-function-9cdcad46-2fa5-4c6b-ac92-14e7bc862b8b" :sig "-"}
"Excel@textjoin@-@16" {:lang "Excel" :algo "textjoin" :lib "-" :id 16 :doc "https://support.microsoft.com/en-us/office/textjoin-function-357b449a-ec91-49d0-80c3-0e8fc845691c" :sig "-"}
"Excel@= (equal)@-@17" {:lang "Excel" :algo "= (equal)" :lib "-" :id 17 :doc "" :sig "-"}
"Excel@textjoin@-@21" {:lang "Excel" :algo "textjoin" :lib "-" :id 21 :doc "https://support.microsoft.com/en-us/office/textjoin-function-357b449a-ec91-49d0-80c3-0e8fc845691c" :sig "-"}
"Excel@transpose@-@22" {:lang "Excel" :algo "transpose" :lib "-" :id 22 :doc "https://support.microsoft.com/en-us/office/transpose-function-ed039415-ed8a-4a81-93e9-4b6dfac76027" :sig "-"}
"Excel@groupby@-@23" {:lang "Excel" :algo "groupby" :lib "-" :id 23 :doc "https://support.microsoft.com/en-us/office/groupby-function-5e08ae8c-6800-4b72-b623-c41773611505" :sig "-"}
"Excel@expand@-@24" {:lang "Excel" :algo "expand" :lib "-" :id 24 :doc "https://support.microsoft.com/en-us/office/expand-function-7433fba5-4ad1-41da-a904-d5d95808bc38" :sig "-"}
"☾@ſ  (fold)@-@1" {:lang "☾" :algo "ſ  (fold)" :lib "-" :id 1 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@ᴍ  (map)@-@2" {:lang "☾" :algo "ᴍ  (map)" :lib "-" :id 2 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@󰈲  (filter positive)@-@3" {:lang "☾" :algo "󰈲  (filter positive)" :lib "-" :id 3 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@Ϝ  (accumulate)@-@4" {:lang "☾" :algo "Ϝ  (accumulate)" :lib "-" :id 4 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⊞  (table product)@-@6" {:lang "☾" :algo "⊞  (table product)" :lib "-" :id 6 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⭥  (indicies)@-@8" {:lang "☾" :algo "⭥  (indicies)" :lib "-" :id 8 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@󷸹  (range not right)@-@8" {:lang "☾" :algo "󷸹  (range not right)" :lib "-" :id 8 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@↨  (enumerate)@-@9" {:lang "☾" :algo "↨  (enumerate)" :lib "-" :id 9 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@􋇐 (bool groupby)@-@10" {:lang "☾" :algo "􋇐 (bool groupby)" :lib "-" :id 10 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@ᙧ  (window)@-@11" {:lang "☾" :algo "ᙧ  (window)" :lib "-" :id 11 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⨝ (join)@-@12" {:lang "☾" :algo "⨝ (join)" :lib "-" :id 12 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@󰒽  (sort decreasing)@-@13" {:lang "☾" :algo "󰒽  (sort decreasing)" :lib "-" :id 13 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@ᚤ  (unique)@-@15" {:lang "☾" :algo "ᚤ  (unique)" :lib "-" :id 15 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@ᔐ  (str)@-@16" {:lang "☾" :algo "ᔐ  (str)" :lib "-" :id 16 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@∈  (left in right)@-@17" {:lang "☾" :algo "∈  (left in right)" :lib "-" :id 17 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@∋  (right in left)@-@17" {:lang "☾" :algo "∋  (right in left)" :lib "-" :id 17 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@󰈲ᔨ (filter correspondence)@-@18" {:lang "☾" :algo "󰈲ᔨ (filter correspondence)" :lib "-" :id 18 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⋁  (any)@-@20" {:lang "☾" :algo "⋁  (any)" :lib "-" :id 20 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⨝  (join)@-@21" {:lang "☾" :algo "⨝  (join)" :lib "-" :id 21 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⍉  (transpose)@-@22" {:lang "☾" :algo "⍉  (transpose)" :lib "-" :id 22 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@󱑼  (zip)@-@22" {:lang "☾" :algo "󱑼  (zip)" :lib "-" :id 22 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@  (groupby)@-@23" {:lang "☾" :algo "  (groupby)" :lib "-" :id 23 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⛶ⁿ  (enlist)@-@25" {:lang "☾" :algo "⛶ⁿ  (enlist)" :lib "-" :id 25 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@ꟿ  (starmap)@-@30" {:lang "☾" :algo "ꟿ  (starmap)" :lib "-" :id 30 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⋀  (all)@-@31" {:lang "☾" :algo "⋀  (all)" :lib "-" :id 31 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@+  (plus)@-@42" {:lang "☾" :algo "+  (plus)" :lib "-" :id 42 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@󰌷  (chain)@-@42" {:lang "☾" :algo "󰌷  (chain)" :lib "-" :id 42 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⨉  (cross product)@-@100" {:lang "☾" :algo "⨉  (cross product)" :lib "-" :id 100 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"☾@⪡  (rotate left)@-@4104" {:lang "☾" :algo "⪡  (rotate left)" :lib "-" :id 4104 :doc "https://ganer.xyz/moon/?code=%22docs%20are%20WIP%22%E2%A8%9D%F3%B0%BB%BE%E2%A8%81%E2%98%BE" :sig "-"}
"TinyAPL@/ (reduce)@-@1" {:lang "TinyAPL" :algo "/ (reduce)" :lib "-" :id 1 :doc "https://tinyapl.rubenverg.com/docs/primitive/reduce" :sig "-"}
"TinyAPL@¨ (each)@-@2" {:lang "TinyAPL" :algo "¨ (each)" :lib "-" :id 2 :doc "https://tinyapl.rubenverg.com/docs/primitive/each" :sig "-"}
"TinyAPL@⌿ (replicate)@-@3" {:lang "TinyAPL" :algo "⌿ (replicate)" :lib "-" :id 3 :doc "https://tinyapl.rubenverg.com/docs/primitive/replicate" :sig "-"}
"TinyAPL@↟ (on prefixes)@-@4" {:lang "TinyAPL" :algo "↟ (on prefixes)" :lib "-" :id 4 :doc "https://tinyapl.rubenverg.com/docs/primitive/on_prefixes" :sig "-"}
"TinyAPL@↡ (on infixes)@-@5" {:lang "TinyAPL" :algo "↡ (on infixes)" :lib "-" :id 5 :doc "https://tinyapl.rubenverg.com/docs/primitive/on_infixes" :sig "-"}
"TinyAPL@⊞ (table)@-@6" {:lang "TinyAPL" :algo "⊞ (table)" :lib "-" :id 6 :doc "https://tinyapl.rubenverg.com/docs/primitive/table" :sig "-"}
"TinyAPL@∙ (inner product)@-@7" {:lang "TinyAPL" :algo "∙ (inner product)" :lib "-" :id 7 :doc "https://tinyapl.rubenverg.com/docs/primitive/inner_product" :sig "-"}
"TinyAPL@⍳ (index generator)@-@8" {:lang "TinyAPL" :algo "⍳ (index generator)" :lib "-" :id 8 :doc "https://tinyapl.rubenverg.com/docs/primitive/index_generator" :sig "-"}
"TinyAPL@∪ (unique)@-@15" {:lang "TinyAPL" :algo "∪ (unique)" :lib "-" :id 15 :doc "https://tinyapl.rubenverg.com/docs/primitive/unique" :sig "-"}
"TinyAPL@⍕ (format)@-@16" {:lang "TinyAPL" :algo "⍕ (format)" :lib "-" :id 16 :doc "https://tinyapl.rubenverg.com/docs/primitive/format" :sig "-"}
"TinyAPL@∊ (element of)@-@17" {:lang "TinyAPL" :algo "∊ (element of)" :lib "-" :id 17 :doc "https://tinyapl.rubenverg.com/docs/primitive/element_of" :sig "-"}
"TinyAPL@⍸ (where)@-@18" {:lang "TinyAPL" :algo "⍸ (where)" :lib "-" :id 18 :doc "https://tinyapl.rubenverg.com/docs/primitive/where" :sig "-"}
"TinyAPL@⍪ (join)@-@21" {:lang "TinyAPL" :algo "⍪ (join)" :lib "-" :id 21 :doc "https://tinyapl.rubenverg.com/docs/primitive/join" :sig "-"}
"TinyAPL@⍉ (transpose)@-@22" {:lang "TinyAPL" :algo "⍉ (transpose)" :lib "-" :id 22 :doc "https://tinyapl.rubenverg.com/docs/primitive/transpose" :sig "-"}
"TinyAPL@⊆ (partition)@-@23" {:lang "TinyAPL" :algo "⊆ (partition)" :lib "-" :id 23 :doc "https://tinyapl.rubenverg.com/docs/primitive/partition" :sig "-"}
"TinyAPL@⌿ (replicate)@-@25" {:lang "TinyAPL" :algo "⌿ (replicate)" :lib "-" :id 25 :doc "https://tinyapl.rubenverg.com/docs/primitive/replicate" :sig "-"}
"TinyAPL@¨ (each)@-@30" {:lang "TinyAPL" :algo "¨ (each)" :lib "-" :id 30 :doc "https://tinyapl.rubenverg.com/docs/primitive/each" :sig "-"}
"TinyAPL@⍪ (catenate)@-@42" {:lang "TinyAPL" :algo "⍪ (catenate)" :lib "-" :id 42 :doc "https://tinyapl.rubenverg.com/docs/primitive/catenate" :sig "-"}
"TinyAPL@⊖ (rotate)@-@4104" {:lang "TinyAPL" :algo "⊖ (rotate)" :lib "-" :id 4104 :doc "https://tinyapl.rubenverg.com/docs/primitive/rotate" :sig "-"}
"C++@chunk@<ranges>@11" {:lang "C++" :algo "chunk" :lib "<ranges>" :id 11 :doc "https://en.cppreference.com/w/cpp/ranges/chunk_view" :sig "-"}
"Haskell@chunksOf@Data.List.Split@11" {:lang "Haskell" :algo "chunksOf" :lib "Data.List.Split" :id 11 :doc "https://hackage.haskell.org/package/split-0.2.5/docs/Data-List-Split.html#v:chunksOf" :sig "-"}
"D@chunks@std.range@11" {:lang "D" :algo "chunks" :lib "std.range" :id 11 :doc "https://dlang.org/library/std/range/chunks.html#0" :sig "-"}
"Rust@chunks@itertools@11" {:lang "Rust" :algo "chunks" :lib "itertools" :id 11 :doc "https://docs.rs/itertools/latest/itertools/trait.Itertools.html#method.chunks" :sig "-"}
"Kotlin@chunked@collections@11" {:lang "Kotlin" :algo "chunked" :lib "collections" :id 11 :doc "https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/chunked.html" :sig "-"}
"D@slide@std.range@27" {:lang "D" :algo "slide" :lib "std.range" :id 27 :doc "https://dlang.org/library/std/range/slide.html" :sig "-"}
"Kap@/ (reduce)@-@1" {:lang "Kap" :algo "/ (reduce)" :lib "-" :id 1 :doc "https://kapdemo.dhsdevelopments.com/reference.html#_reduce" :sig "-"}
"Kap@\\ (scan)@-@4" {:lang "Kap" :algo "\\ (scan)" :lib "-" :id 4 :doc "https://kapdemo.dhsdevelopments.com/reference.html#scan" :sig "-"}
})
