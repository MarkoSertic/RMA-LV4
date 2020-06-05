package markosertic.ferit.com.mindorks.framework.lv4.data.api

import io.reactivex.Single
import markosertic.ferit.com.mindorks.framework.lv4.data.model.User


interface ApiService {

    fun getUsers(): Single<List<User>>

}