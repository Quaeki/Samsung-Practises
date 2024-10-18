import kotlin.random.Random

class Wizard(health: Int, power: Int, var mana: Int) : Human(health, power) {
    override fun Attack(): Int {
        // Если мана больше 0 и attack < 30, урон равен 0
        return if (mana > 0 && attack < 30) {
            mana -= 10
            0
        } else {
            super.Attack()
        }
    }

    override fun RageAttack(): Int {
        return if (mana > 0 && attack < 50) {
            mana -= 30
            0
        } else {
            super.RageAttack()
        }
    }

    override fun Heal(): Int {
        return super.Heal()
    }

    // Удаляем метод human(), так как он не определен в базовом классе или интерфейсе
}
