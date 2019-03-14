package com.example.kotlin.coroutines

import kotlinx.coroutines.Deferred

enum class Gender{
    MALE,FEMALE;

    companion object {
        fun valueOfIgnoreCase(name:String) : Gender = valueOf(name.toUpperCase())
    }
}

typealias  UserId = Int

data class User(val id: UserId, val firstName : String, val lastName : String, val gender: Gender)

data class Fact(val  id : Int, val value : String,val user: User ?= null)

interface UserService {
    fun getFact(id: UserId): Fact
    fun async(function: () -> Fact): Deferred<Fact>
    fun launch(function: () -> Unit)
}

interface UserClient {
    fun getUser(id: UserId): User
}
interface FactClient {
    fun getFact(user: User): Fact
}


interface UserRepository {
    fun getUserById(id: UserId): User?
    fun insertUser(user: User)
}
interface FactRepository {
    fun getFactByUserId(id: UserId): Fact?
    fun insertFact(fact: Fact)
}


fun main(args: Array<String>) {
        Gender.valueOfIgnoreCase("name" )
}

/*
abstract class WebClient {
    protected val apacheClient = ApacheClient()
    protected val gson = GsonBuilder()
            .registerTypeAdapter<User> {
                deserialize { des ->
                    val json = des.json
                    User(json["info"]["seed"].int,
                            json["results"][0]["name"]["first"].string.capitalize(),
                            json["results"][0]["name"]["last"].string.capitalize(),
                            Gender.valueOfIgnoreCase(json["results"][0]["gender"].string))
                }
            }
            .registerTypeAdapter<Fact> {
                deserialize { des ->
                    val json = des.json
                    Fact(json["value"]["id"].int,
                            json["value"]["joke"].string)
                }
            }.create()!!
}

class Http4KUserClient : WebClient(), UserClient {
    override fun getUser(id: UserId): User {
        return gson.fromJson(apacheClient(Request(Method.GET, "https://randomuser.me/api")
                .query("seed", id.toString()))
                .bodyString())
    }
}*/
