import kotlin.random.Random

interface IAttack {
    var attack: Int
    var heal: Int
    var damage: Int

    fun initializeDamage() {
        damage = 100  // Устанавливаем начальное значение
    }

    fun Attack():Int {
        attack++
        return Random.nextInt(0, 100) + attack
    }

    fun RageAttack(): Int{
        attack += 5
        return Random.nextInt(50, 100) + attack
    }
    fun Heal(): Int {
        val healingAmount = Random.nextInt(10, 25)
        heal += healingAmount
        return healingAmount
    }

    fun damage(): Int{
        val RageDamage = RageAttack()
        damage -= RageDamage

        val UsallyDamage = Attack()
        damage -= UsallyDamage

        return damage
    }
}