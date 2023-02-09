package org.bubenheimer.app

import android.app.Activity
import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.os.StrictMode

class MyContentProvider : ContentProvider() {
    override fun onCreate(): Boolean {
        StrictMode.setThreadPolicy(
                StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy())
                        .detectDiskReads()
                        .penaltyDeath()
                        .build()
        )

        return true
    }

    override fun query(uri: Uri, projection: Array<out String>?, selection: String?, selectionArgs: Array<out String>?, sortOrder: String?): Cursor? {
        TODO("Not yet implemented")
    }

    override fun getType(uri: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Not yet implemented")
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("Not yet implemented")
    }
}

class MainActivity : Activity()
