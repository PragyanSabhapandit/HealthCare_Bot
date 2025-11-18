// KOTLIN HOSPITAL CHATBOT CUSTOMIZATION GUIDE
// This file shows how to customize colors, design, headings, and text

// ===================================
// 1. CUSTOMIZING COLORS
// ===================================

// Replace the Colors object in the main file with any of these themes:

// DEFAULT THEME (Current)
private object Colors {
    const val RESET = "\u001B[0m"
    const val BLUE = "\u001B[34m"
    const val GREEN = "\u001B[32m"
    const val RED = "\u001B[31m"
    const val YELLOW = "\u001B[33m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
    const val BOLD = "\u001B[1m"
}

// DARK THEME
private object DarkColors {
    const val RESET = "\u001B[0m"
    const val BLUE = "\u001B[94m"      // Bright blue
    const val GREEN = "\u001B[92m"     // Bright green
    const val RED = "\u001B[91m"       // Bright red
    const val YELLOW = "\u001B[93m"    // Bright yellow
    const val PURPLE = "\u001B[95m"    // Bright magenta
    const val CYAN = "\u001B[96m"      // Bright cyan
    const val WHITE = "\u001B[97m"     // Bright white
    const val BOLD = "\u001B[1m"
    const val DIM = "\u001B[2m"        // Dim text
}

// MEDICAL THEME
private object MedicalColors {
    const val RESET = "\u001B[0m"
    const val BLUE = "\u001B[38;5;27m"     // Medical blue
    const val GREEN = "\u001B[38;5;34m"    // Medical green
    const val RED = "\u001B[38;5;196m"     // Emergency red
    const val YELLOW = "\u001B[38;5;220m"  // Warning yellow
    const val PURPLE = "\u001B[38;5;141m"  // Soft purple
    const val CYAN = "\u001B[38;5;51m"     // Hospital cyan
    const val WHITE = "\u001B[97m"
    const val BOLD = "\u001B[1m"
    const val BACKGROUND_BLUE = "\u001B[48;5;27m"  // Blue background
}

// RAINBOW THEME
private object RainbowColors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[38;5;196m"
    const val ORANGE = "\u001B[38;5;208m"
    const val YELLOW = "\u001B[38;5;226m"
    const val GREEN = "\u001B[38;5;46m"
    const val BLUE = "\u001B[38;5;21m"
    const val INDIGO = "\u001B[38;5;54m"
    const val VIOLET = "\u001B[38;5;129m"
    const val BOLD = "\u001B[1m"
}

// ===================================
// 2. CUSTOMIZING WELCOME SCREEN
// ===================================

// Replace the displayWelcomeScreen() function with any of these:

// SIMPLE WELCOME SCREEN
private fun simpleWelcomeScreen() {
    println("${Colors.BLUE}${Colors.BOLD}")
    println("========================================")
    println("     HEALTHCARE ASSISTANT CHATBOT      ")
    println("========================================")
    println("${Colors.RESET}")
}

// MEDICAL THEMED WELCOME
private fun medicalWelcomeScreen() {
    println("${Colors.GREEN}${Colors.BOLD}")
    println("┌─────────────────────────────────────────────────────────┐")
    println("│  ⚕️  DIGITAL HEALTH COMPANION ⚕️                     │")
    println("│                                                         │")
    println("│     🩺 Professional Medical Assessment 🩺            │")
    println("│                                                         │")
    println("│        💊 Symptom Analysis & Care Guidance 💊        │")
    println("└─────────────────────────────────────────────────────────┘")
    println("${Colors.RESET}")
}

// FRIENDLY WELCOME SCREEN
private fun friendlyWelcomeScreen() {
    println("${Colors.CYAN}${Colors.BOLD}")
    println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨")
    println("✨                                                        ✨")
    println("✨     🌟 WELCOME TO CAREBUDDY 🌟                      ✨")
    println("✨                                                        ✨")
    println("✨        Your Friendly Health Assistant 💙              ✨")
    println("✨                                                        ✨")
    println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨")
    println("${Colors.RESET}")
}

// PROFESSIONAL WELCOME SCREEN
private fun professionalWelcomeScreen() {
    println("${Colors.BLUE}${Colors.BOLD}")
    println("╔══════════════════════════════════════════════════════════╗")
    println("║                                                          ║")
    println("║         🏥 CLINICAL ASSESSMENT SYSTEM 🏥               ║")
    println("║                                                          ║")
    println("║              Advanced Medical AI v2.0                   ║")
    println("║                                                          ║")
    println("║         📊 Evidence-Based Care Recommendations 📊      ║")
    println("║                                                          ║")
    println("╚══════════════════════════════════════════════════════════╝")
    println("${Colors.RESET}")
}

// ===================================
// 3. CUSTOMIZING BOT MESSAGES
// ===================================

// Replace displayBotMessage() with any of these styles:

// SIMPLE BOT MESSAGE
private fun simpleBotMessage(message: String) {
    println("Bot: $message")
    println()
}

// MEDICAL PROFESSIONAL STYLE
private fun medicalBotMessage(message: String) {
    println("${Colors.BLUE}${Colors.BOLD}🩺 Dr. Assistant:${Colors.RESET}")
    println("${Colors.CYAN}   » $message${Colors.RESET}")
    println()
}

// FRIENDLY STYLE
private fun friendlyBotMessage(message: String) {
    println("${Colors.GREEN}${Colors.BOLD}😊 CareBuddy:${Colors.RESET}")
    println("${Colors.GREEN}   💬 $message${Colors.RESET}")
    println()
}

// PROFESSIONAL CLINICAL STYLE
private fun clinicalBotMessage(message: String) {
    println("${Colors.PURPLE}${Colors.BOLD}📋 Clinical System:${Colors.RESET}")
    println("${Colors.WHITE}   ▶ $message${Colors.RESET}")
    println()
}

// ===================================
// 4. CUSTOMIZING APPOINTMENT DISPLAY
// ===================================

// Different appointment card styles:

// SIMPLE APPOINTMENT CARD
private fun simpleAppointmentCard(appointmentInfo: AppointmentInfo) {
    println("${appointmentInfo.color}")
    println("=== APPOINTMENT RECOMMENDATION ===")
    println("Department: ${appointmentInfo.department}")
    println("Urgency: ${appointmentInfo.urgency}")
    println("Timeframe: ${appointmentInfo.timeframe}")
    println("Priority: ${appointmentInfo.priority}")
    println("==================================")
    println("${Colors.RESET}")
}

// MEDICAL CARD STYLE
private fun medicalAppointmentCard(appointmentInfo: AppointmentInfo) {
    println("${appointmentInfo.color}${Colors.BOLD}")
    println("┌─────────────────────────────────────────┐")
    println("│  🏥 MEDICAL RECOMMENDATION SUMMARY 🏥  │")
    println("├─────────────────────────────────────────┤")
    println("│  Dept: ${appointmentInfo.department.padEnd(30)}│")
    println("│  Level: ${appointmentInfo.urgency.padEnd(29)}│")
    println("│  When: ${appointmentInfo.timeframe.padEnd(30)}│")
    println("│  Priority: ${appointmentInfo.priority.padEnd(26)}│")
    println("└─────────────────────────────────────────┘")
    println("${Colors.RESET}")
}

// ===================================
// 5. CUSTOMIZING PROGRESS BAR
// ===================================

// Different progress bar styles:

// SIMPLE PROGRESS BAR
private fun simpleProgressBar(current: Int, total: Int) {
    val progress = (current.toDouble() / total * 100).toInt()
    println("Progress: $current/$total ($progress%)")
}

// MEDICAL PROGRESS BAR
private fun medicalProgressBar(current: Int, total: Int) {
    val progress = (current.toDouble() / total * 100).toInt()
    val bars = "🟢".repeat(progress / 10) + "⚪".repeat(10 - progress / 10)
    println("${Colors.GREEN}Assessment Progress: [$bars] $progress%${Colors.RESET}")
}

// HEART RATE STYLE PROGRESS
private fun heartRateProgressBar(current: Int, total: Int) {
    val progress = (current.toDouble() / total * 100).toInt()
    val hearts = "💚".repeat(progress / 10) + "🤍".repeat(10 - progress / 10)
    println("${Colors.RED}Health Check: [$hearts] $progress%${Colors.RESET}")
}

// ===================================
// 6. CUSTOMIZING CHAT QUESTIONS
// ===================================

// Different question styles for the chat steps:

// MEDICAL PROFESSIONAL QUESTIONS
private val medicalChatSteps = listOf(
    ChatStep(
        "Thank you, {name}. For medical records, please provide your age:",
        "age"
    ),
    ChatStep(
        "Please describe your current symptoms in detail, including onset and characteristics:",
        "symptoms"
    ),
    ChatStep(
        "Rate your pain/discomfort on the clinical scale (1=minimal, 10=severe):",
        "severity"
    ),
    // ... continue with medical terminology
)

// FRIENDLY QUESTIONS
private val friendlyChatSteps = listOf(
    ChatStep(
        "Great to meet you, {name}! 😊 Could you tell me how old you are?",
        "age"
    ),
    ChatStep(
        "I'm here to help! 🤗 What's been bothering you lately? Tell me about your symptoms:",
        "symptoms"
    ),
    ChatStep(
        "On a scale of 1 to 10, how uncomfortable are you feeling? 🤒",
        "severity"
    ),
    // ... continue with friendly tone
)

// CLINICAL QUESTIONS
private val clinicalChatSteps = listOf(
    ChatStep(
        "Patient {name} - Age verification required for assessment protocol:",
        "age"
    ),
    ChatStep(
        "Symptom documentation - Please provide detailed clinical presentation:",
        "symptoms"
    ),
    ChatStep(
        "Severity assessment using numeric rating scale (NRS 1-10):",
        "severity"
    ),
    // ... continue with clinical language
)

// ===================================
// HOW TO USE THESE CUSTOMIZATIONS:
// ===================================

/*
1. COLORS: Replace the Colors object in the main file with any theme above

2. WELCOME SCREEN: Replace the displayWelcomeScreen() function with your preferred style

3. BOT MESSAGES: Replace displayBotMessage() function with your preferred style

4. APPOINTMENT DISPLAY: Replace displayAppointmentDetails() function

5. PROGRESS BAR: Replace displayProgress() function

6. QUESTIONS: Replace the chatSteps list with your preferred question style

EXAMPLE USAGE:
- For a medical theme: Use MedicalColors + medicalWelcomeScreen + medicalBotMessage
- For a friendly theme: Use RainbowColors + friendlyWelcomeScreen + friendlyBotMessage
- For professional: Use DarkColors + professionalWelcomeScreen + clinicalBotMessage

Mix and match these components to create your perfect chatbot interface!
*/