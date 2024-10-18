import kotlin.random.Random

class Knight(health: Int = 100, power: Int, var defence: Int?) : Human(health, power) {
    override fun Attack(): Int {
        return if (defence != null) {
            super.Attack() - defence!!
        } else {
            super.Attack()
        }
    }

    override fun RageAttack(): Int {
        return if (defence != null) {
            super.RageAttack() + 5
        } else {
            super.RageAttack()
        }
    }

    override fun Heal(): Int {
        return super.Heal()
    }

    // Удаляем метод damage(), так как он уже реализован в интерфейсе IAttack
}
