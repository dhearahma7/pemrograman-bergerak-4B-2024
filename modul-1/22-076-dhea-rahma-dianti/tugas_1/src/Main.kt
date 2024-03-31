//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Orang(val beratBadan:Double, val tinggiBadan: Double) {
    abstract fun calculateBMI():Double
}

class BMI(beratBadan:Double, tinggiBadan:Double):Orang(beratBadan, tinggiBadan) {
    override fun calculateBMI(): Double {
        val bmi = beratBadan / ((tinggiBadan/100*tinggiBadan/100))
        return bmi
    }

    fun kategoriHasil(){
        return when(calculateBMI()){
            in 0.0..17.0 -> println("Hasil : Kurus (Kekurangan berat badan tingkat berat)")
            in 17.0..18.5 -> println("Hasil : Kurus (Kekurangan berat badan tingkat rendah)")
            in 18.5..25.0 -> println("Hasil : Normal (Normal)")
            in 25.0..27.0 -> println("Hasil : Gemuk (Kelebihan berat badan tingkat ringan)")
            else -> println("Hasil : Gemuk (kelebihan berat badan tingkat berat)")
        }
    }
}

fun main() {
    do {
        println("Masukkan berat badan (kg):")
        val berat = readLine()?.toDouble()
        println("Masukkan tinggi badan:")
        val tinggi = readLine()?.toDouble()

        val bmi = BMI(berat?:0.0,tinggi?:0.0)
        bmi.kategoriHasil()
        print("Apakah Anda ingin melanjutkan? (y/n): ")
        var lanjut: Boolean = true
        try {
            val input = readLine()!!.toLowerCase()
            when (input) {
                "y" -> lanjut = true
                "n" -> lanjut = false
                else -> throw IllegalArgumentException("Input tidak valid")
            }
        } catch (e: IllegalArgumentException) {
            println(e.message)
            lanjut = true
        }
    } while (lanjut)
}




