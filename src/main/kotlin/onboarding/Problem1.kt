package onboarding

import problem1.NextPageVerifier
import problem1.OddVerifier
import problem1.RangeVerifier

fun solution1(pobi: List<Int>, crong: List<Int>): Int {
    val pobiRangeVerifier = RangeVerifier(pobi[0])
    val crongRangeVerifier = RangeVerifier(crong[0])
    if(!pobiRangeVerifier.verify() || !crongRangeVerifier.verify()) {
        TODO("예외처리")
    }

    val pobiOddVerifier = OddVerifier(pobi[0])
    val crongOddVerifier = OddVerifier(crong[0])
    if(!pobiOddVerifier.verify() || !crongOddVerifier.verify()) {
        TODO("예외처리")
    }

    val pobiNextPageVerifier = NextPageVerifier(pobi[0], pobi[1])
    val crongNextPageVerifier = NextPageVerifier(crong[0], crong[1])
    if(!pobiNextPageVerifier.verify() || !crongNextPageVerifier.verify()) {
        TODO("예외처리")
    }

    return -1
}
