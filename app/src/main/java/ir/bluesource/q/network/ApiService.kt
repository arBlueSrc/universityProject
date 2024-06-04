package ir.bluesource.q.network

import ir.bluesource.q.model.ResponseTicket
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    //-------------------------new Edition-------------------------//
    @FormUrlEncoded
    @POST("api/registerForm")
    suspend fun registerForm(
        @Field("name") name: String,
        @Field("phone") phone: String,
        @Field("job") job: String,
        @Field("1") q1: Int?,
        @Field("2") q2: Int?,
        @Field("3") q3: Int?,
        @Field("4") q4: Int?,
        @Field("5") q5: Int?,
        @Field("6") q6: Int?,
        @Field("7") q7: Int?,
        @Field("8") q8: Int?,
        @Field("9") q9: Int?,
        @Field("10") q10: Int?,
        @Field("11") q11: Int?,
        @Field("12") q12: Int?,
        @Field("13") q13: Int?,
        @Field("14") q14: Int?,
        @Field("15") q15: Int?,
        @Field("16") q16: Int?,
        @Field("17") q17: Int?,
        @Field("18") q18: Int?,
        @Field("19") q19: Int?,
        @Field("20") q20: Int?,
        @Field("21") q21: Int?,
        @Field("22") q22: Int?,
        @Field("23") q23: Int?,
        @Field("24") q24: Int?,
        @Field("25") q25: Int?,
        @Field("26") q26: Int?,
        @Field("27") q27: Int?,
        @Field("28") q28: Int?,
        @Field("29") q29: Int?,
        @Field("30") q30: Int?,
        @Field("31") q31: Int?,
        @Field("32") q32: Int?,
    ): ResponseTicket

}