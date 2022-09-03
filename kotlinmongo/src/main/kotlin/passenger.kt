import com.mongodb.MongoClient
import com.mongodb.MongoException
import com.mongodb.BasicDBObject

fun main(args: Array<String>) {
    var mongoClient:MongoClient?=null   //Elvis Operator ?
    try {
        mongoClient = MongoClient("127.0.0.1",27017)
        println("Connected to MongoDB ")

        //Read query

        var db = mongoClient.getDB("bookingsdb")
        var col = db.getCollection("passenger")
        var cursur = col.find().limit(10)
        var it = cursur.iterator()
        while(it.hasNext()){
            println(it.next())
        }
        //insert query
        var col1 = db.getCollection("passenger")
        var document = BasicDBObject()

        document.put("passenger_source","chennai")
        document.put("passenger_destination", "ooty")
        col1.insert(document)

        var cursur1 = col1.find().limit(1)
        var it1 = cursur1.iterator()
        while(it1.hasNext()){
            println(it1.next())
        }
    }catch(e:MongoException){
        e.printStackTrace() //it will show what the exception is
    }finally{
        mongoClient?.close()
    }
    println("Hello World")
}