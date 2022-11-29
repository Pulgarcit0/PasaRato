

//coralillo 951 398 73 36
/* function to sort array using shellSort in kotin*/
fun sort(arr: IntArray): Int {
    val n = arr.size

    // decide the gap, then reduce the gap
    var gap = n / 2
    while (gap > 0) {
        // Do a gapped insertion sort for this gap size.
        // The first gap elements a[0..gap-1] are already
        // in gapped order keep adding one more element
        // until the entire array is gap sorted
        var i = gap
        while (i < n) {
            // add a[i] to the elements that
            // have been gap sorted save a[i] in temp and make a hole at
            // position i
            val temp = arr[i]

            // shift earlier gap-sorted elements up until
            //the correct location for a[i] is found
            var j = i
            while (j >= gap && arr[j - gap] > temp) {
                arr[j] = arr[j - gap]
                j -= gap
            }

            // put temp (the original a[i]) in its correct
            // location
            arr[j] = temp
            i += 1
        }
        gap /= 2
    }
    return 0
}
fun Sort(args: Array<String>) {
    val arr = intArrayOf(23, 12, 1, 8, 34, 54, 2, 3)
    println("Array before sorting->>ANTES")
    for( a in arr) print("$a  ")
    sort(arr)
    println("Array after sorting-->>>DESPUES")
    for( a in arr) print("$a  ")
}
