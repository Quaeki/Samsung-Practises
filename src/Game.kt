class Game {
    companion object {
        enum class CharacterType {
            WIZARD, ROBOT, KNIGHT
        }

        fun createCharacter(type: CharacterType): Human {
            return when (type) {
                CharacterType.WIZARD -> Wizard(100, 20, 50)
                CharacterType.ROBOT -> Robot(120, 25, 80)
                CharacterType.KNIGHT -> Knight(150, 30, 10)
            }
        }
        fun applyDamage(character: Human, damage: Int) {
            character.health = (character.health - damage).coerceAtLeast(0)
        }
    }
}

