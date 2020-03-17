/** A tax bracket is a range of income that gets taxed a certain percentage of that income.
 * The income cap is the maximum amount for which you will get taxed that percentage.
 *
 * In the nation of Examplania, the following tax brackets are applied:
 *
 *     income cap        marginal tax rate
 *       10,000               0.00 (0%)
 *       30,000               0.10 (10%)
 *       100,000              0.25 (25%)
 *       ------               0.40 (40%)
 *
 * If you were to have an income of less than 10,000, you would be taxed 0% out of that
 * income. If you gained between 30,000 and 10,000, you would be taxed 10% of your income.
 *
 * If your income is between 30,000 and 100,000, you owe 10% of your income between 10,000 and 30,000,
 * plus 25% of your income over 30,000.
 *
 * Finally, if your income is over 100,000, you owe 10% of your income from 10,000 to 30,000, plus 25%
 * of your income from 30,000 to 100,000, plus 40% of your income above 100,000.
 *
 * @see applyTax
 * For this problem, you must implement the applyTax function so that it returns the taxed amount from
 * a given income. As input it will receive the income to tax, and you must return the tax it owes.
 *
 * * * * * * Challenge * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * The overall tax rate is the total tax divided by the total income. For example, an income of 256,250
 * has an overall tax of 82,000 which is an overall tax rate of exactly 32%:
 * 82000 = 0.00 * 10,000 + 0.10 * 20,000 + 0.25 * 70,000 + 0.40 * 156250
 * 82000 = 0.32 * 256,250
 *
 * @see computeIncomeForTaxRate
 * In the function computeIncomeForTaxRate, you will be given a certain overall tax rate and you must find the
 * income amount that would be taxed that rate in Examplania.
 * Examples:
 *     computeIncomeForTaxRate(0.0) => 0 (or anything up to 10000)
 *     computeIncomeForTaxRate(0.06) => 25,000
 *     computeIncomeForTaxRate(0.09) => 34,375
 *     computeIncomeForTaxRate(0.4) => Double.NaN (No such value exists)
 */

fun applyTax(income: Double): Double{
    return 0.0
}

fun computeIncomeForTaxRate(overallTaxRate: Double): Double {
    return 0.0
}

/* Challenge credit:
 * u/Cosmologicon r/dailyprogrammer
 * https://www.reddit.com/r/dailyprogrammer/comments/cdieag/20190715_challenge_379_easy_progressive_taxation/
 */