package com.spacemagical.spacemagical.components

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import com.spacemagical.spacemagical.adapters.UsersAdapter
import com.spacemagical.spacemagical.models.User

class UsersListCard : ListCard {

    constructor(context: Context): super(context)
    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    fun setUsers(users: List<User>) {
        setAdapter(UsersAdapter(context, users) as RecyclerView.Adapter<RecyclerView.ViewHolder>)
    }
}