package markosertic.ferit.com.mindorks.framework.lv4.data.repository

import markosertic.ferit.com.mindorks.framework.lv4.data.api.ApiHelper
import markosertic.ferit.com.mindorks.framework.lv4.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}