import kotlin.random.Random

abstract class Human(var health: Int, var power: Int) : IAttack {
    override var attack: Int = 0
    override var heal: Int = 0
    override var damage: Int = 100

    override fun Attack(): Int {
        attack++
        return Random.nextInt(0, 100) + attack
    }

    override fun Heal(): Int {
        val healingAmount = Random.nextInt(10, 25)
        heal += healingAmount
        return healingAmount
    }

    // Можно оставить RageAttack() с реализацией по умолчанию или переопределить в подклассах
}

