fun main() {
    containsDuplicate(intArrayOf(1, 2, 3, 1))
    containsDuplicateV2(intArrayOf(1, 2, 3, 1))
}

fun containsDuplicate(nums: IntArray): Boolean {
    println("In V1 :")
    val arrayToSet = nums.toSet()
    if (arrayToSet.size == nums.size) {
        println("Duplicate not found")
        return false
    }
    println("Duplicate found")
    return true
}

fun containsDuplicateV2(nums: IntArray): Boolean {
    println("In V2 :")
    val seen = hashSetOf<Int>()
    nums.forEach { num ->
        if (seen.contains(num)) {
            println("Duplicate found")
            return true
        }
        seen.add(num)
    }
    println("Duplicate not found")
    return false
}
