fun main() {
    val wizard = Wizard(health = 100, power = 20, mana = 50)
    val robot = Robot(120, 25, 80)
    val knight = Knight(150, 30, 10)

    // Пример использования атаки и применения урона
    val wizardAttack = wizard.Attack()
    Game.applyDamage(wizard, wizardAttack)
    println("Wizard attack: $wizardAttack, Health left: ${wizard.health}")

    val robotAttack = robot.Attack()
    Game.applyDamage(robot, robotAttack)
    println("Robot attack: $robotAttack, Health left: ${robot.health}")

    val knightAttack = knight.Attack()
    Game.applyDamage(knight, knightAttack)
    println("Knight attack: $knightAttack, Health left: ${knight.health}")

    // Исцеление
    val wizardHeal = wizard.Heal()
    wizard.health += wizardHeal
    println("Wizard heal: $wizardHeal, Health: ${wizard.health}")

    val robotHeal = robot.Heal()
    robot.health += robotHeal
    println("Robot heal: $robotHeal, Health: ${robot.health}")

    val knightHeal = knight.Heal()
    knight.health += knightHeal
    println("Knight heal: $knightHeal, Health: ${knight.health}")

    // Вывод рейтинга персонажей по оставшемуся здоровью
    val characters = listOf(wizard, robot, knight)
    characters.sortedByDescending { it.health }.forEachIndexed { index, character ->
        println("Рейтинг персонажа ${index + 1}: ${character.javaClass.simpleName} с ${character.health} здоровья")
    }
}


