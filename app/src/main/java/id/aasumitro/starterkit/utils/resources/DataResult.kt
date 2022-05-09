package id.aasumitro.starterkit.utils.resources

import id.aasumitro.starterkit.utils.enums.DataState

/**
 * A generic class that holds a value.
 * @param <T>
 */
sealed class DataResult<out R> {
    data class Success<out T>(
        val data: T,
        val state: DataState = DataState.SUCCESS
    ) : DataResult<T>()

    data class Error(
        val exception: Exception,
        val state: DataState = DataState.ERROR
    ) : DataResult<Nothing>()

    data class Loading<out T>(
        val state: DataState = DataState.LOADING
    ) : DataResult<T>()
}