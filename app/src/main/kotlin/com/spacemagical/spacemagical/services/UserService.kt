package com.spacemagical.spacemagical.services

import com.spacemagical.spacemagical.models.JobType
import com.spacemagical.spacemagical.models.Space
import com.spacemagical.spacemagical.models.User
import rx.Observable
import java.util.*

object UserService {
    fun getAll(): Observable<List<User>> {
        return Observable.create {
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                it.onError(e)
            }

            val jobType = JobType(1, "engineer")
            val users = ArrayList<User>()
            val user1 = User(1, "Jack", "http://www.american.edu/uploads/profiles/large/chris_palmer_profile_11.jpg", jobType)
            val user2 = User(2, "Json", "http://matchpredictions.in/wp-content/uploads/2015/09/MS-Dhoni-Cricinfo-Yahoo-Profile-Stats-Highlights.jpg", jobType)
            users.add(user1)
            users.add(user2)
            it.onNext(users)
            it.onCompleted()
        }
    }

    fun get(id: Int): Observable<User> {
        return Observable.create {
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                it.onError(e)
            }

            val jobType = JobType(1, "engineer")
            val user = User(1, "Jack", "http://www.american.edu/uploads/profiles/large/chris_palmer_profile_11.jpg", jobType)
            it.onNext(user)
            it.onCompleted()
        }
    }
}
