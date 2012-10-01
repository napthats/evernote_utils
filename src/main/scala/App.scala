package com.napthats.android.evernote

import _root_.android.app.Activity
import _root_.android.content.Intent


object Evernote {
  def createNote(act:Activity, title: String, text: String) {
    val intent = new Intent()
    intent.setAction("com.evernote.action.CREATE_NEW_NOTE")
    intent.putExtra(Intent.EXTRA_TITLE, title)
    intent.putExtra(Intent.EXTRA_TEXT, text)
    intent.putExtra("QUICK_SEND", true)
    act.startActivity(intent)
  }
}

