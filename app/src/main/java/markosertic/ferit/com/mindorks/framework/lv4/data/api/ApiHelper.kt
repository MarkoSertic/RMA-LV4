package markosertic.ferit.com.mindorks.framework.lv4.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}