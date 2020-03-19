/** Imagine a necklace with bead that have letter on them. These beads can slide along the string.
 *  In a string with the letters NICOLE, you could take the N out and slide it to the other end
 *  to make it ICOLEN. Do it again to get COLENI, and so on. For this problem, we'll say that the
 *  strings NICOLE, ICOLEN, and COLENI describe the same necklace.
 *
 *  Image of Necklace: https://www.craftkitsandsupplies.com/images/Beads/Alpha_Beads/Wood_Alphabet_Beads_26217.jpg
 *
 *  @see areSameNecklace
 *  In this function you must return whether two strings are the same necklace. This would mean that
 *  you can remove some number of letters from the beginning of the first string, attach them
 *  to the end in their original ordering, and get the other string. Reordering the letters in
 *  some other way does not produce a string that describes the same necklace.
 *
 *  Examples:
 *
 *  areSameNecklace("nicole", "icolen") => true
 *  areSameNecklace("nicole", "coneli") => false
 *  areSameNecklace("xyxxz", "xxzxy") => true
 *  areSameNecklace("", "") => true
 *
 *  ----------------------BONUS-------------------------------------------
 *  @see repeats
 *  If you have a  string of N letters and you move each letter one at a time from the start
 *  to the end, you'll eventually get back to the string you started with, after N steps.
 *  Sometimes, you'll see the same string you started with before N steps. For instance, if you
 *  start with "abcabcabc", you'll see the same string "abcabcabc" 3 times over the course of
 *  moving a letter 9 times.
 *  This function must return the number of times you encounter the same starting string if you move
 *  each letter in the string from the start to the end, one at a time. This means that if you move
 *  every letter in the string "aaaaaa" from the start to the end one time, you would find the same starting
 *  string "aaaaaa" six times, one for each time you moved the first letter.
 */

fun areSameNecklace(firstString: String, secondString: String): Boolean{
    return false
}

fun repeats(string: String): Int{
    return 0
}

/* Challenge credit:
 * u/Cosmologicon r/dailyprogrammer
 * https://www.reddit.com/r/dailyprogrammer/comments/ffxabb/20200309_challenge_383_easy_necklace_matching/
 */