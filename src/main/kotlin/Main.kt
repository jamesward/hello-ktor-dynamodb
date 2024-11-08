import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*

val bars = mutableListOf<Bar>()

val server = embeddedServer(CIO, port = 8080) {
    install(ContentNegotiation) {
        json()
    }

    routing {
        get ("/bars") {
            call.respond(bars)
        }
        post ("/bars") {
            val bar = call.receive<Bar>()
            val barWithId = bar.copy(id = bars.size)
            bars.add(barWithId)
            call.respond(HttpStatusCode.Created, barWithId)
        }
    }
}

fun main() {
    server.start(wait = true)
}