package com.jiac.common.net

interface IRepositoryManager {
    fun <T> obtainRetrofitService(service: Class<T>): T

    fun <T> obtainCacheService(service: Class<T>): T

    fun clarAllCache()
}