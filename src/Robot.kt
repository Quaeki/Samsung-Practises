import kotlin.random.Random

class Robot(health: Int, power: Int, var battery: Int = 100) : Human(health, power) {
    override fun Attack(): Int {
        return if (battery >= 50) {
            battery -= 10
            super.Attack() + 10
        } else if (battery in 1..49) {
            battery -= 5
            super.Attack()  // Если батарея < 50, добавляем обычную атаку
        } else {
            0  // Если батарея равна 0, атака равна 0
        }
    }

    override fun RageAttack(): Int {
        return if (battery >= 50) {
            battery -= 10
            super.RageAttack() + 40
        } else if (battery in 1..49) {
            battery -= 5
            super.Attack() + 10  // Если батарея < 50, добавляем 10 к обычной атаке
        } else {
            0  // Если батарея равна 0, атака равна 0
        }
    }

    override fun Heal(): Int {
        return super.Heal()
    }
}
