package com.google.android.libraries.social.adsprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.net.Uri;
import android.util.Log;
import giz;
import gjb;
import gvo;
import java.net.HttpCookie;
import java.util.Arrays;
import kbu;
import kcg;
import mbb;

public final class AdsProvider
  extends ContentProvider
{
  private static final UriMatcher a;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    a = localUriMatcher;
    localUriMatcher.addURI("com.google.plus.platform", "token", 3);
  }
  
  private static Cursor a(String[] paramArrayOfString, String paramString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length != 1)) {
      throw new IllegalArgumentException("Expected a single column projection");
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(paramArrayOfString);
    localMatrixCursor.newRow().add(paramString);
    return localMatrixCursor;
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public final String getType(Uri paramUri)
  {
    switch (a.match(paramUri))
    {
    default: 
      String str = String.valueOf(paramUri);
      throw new IllegalArgumentException(12 + String.valueOf(str).length() + "Unknown URI " + str);
    }
    return "vnd.android.cursor.item/vnd.com.google.plus.platform.token";
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public final boolean onCreate()
  {
    return true;
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    String str1 = paramUri.getQueryParameter("account");
    String str2;
    giz localgiz2;
    if (str1 != null)
    {
      str2 = str1;
      localgiz2 = (giz)mbb.a(getContext(), giz.class);
      if (str2 == null) {
        break label119;
      }
    }
    label119:
    for (int j = localgiz2.a(str2);; j = -1)
    {
      if (j != -1) {
        break label125;
      }
      return null;
      giz localgiz1 = (giz)mbb.a(getContext(), giz.class);
      int i = localgiz1.c("active-plus-account");
      if (localgiz1.c(i))
      {
        str2 = localgiz1.a(i).b("account_name");
        break;
      }
      str2 = null;
      break;
    }
    label125:
    if (Log.isLoggable("AdsProvider", 3))
    {
      String str11 = String.valueOf(paramUri);
      String str12 = String.valueOf(Arrays.toString(paramArrayOfString1));
      String str13 = String.valueOf(Arrays.toString(paramArrayOfString2));
      new StringBuilder(66 + String.valueOf(str2).length() + String.valueOf(str11).length() + String.valueOf(str12).length() + String.valueOf(paramString1).length() + String.valueOf(str13).length()).append(">>>>> Ads query by ").append(str2).append(", uri ").append(str11).append(", projection ").append(str12).append(", selection ").append(paramString1).append(", selectionArgs ").append(str13);
    }
    switch (a.match(paramUri))
    {
    default: 
      String str10 = String.valueOf(paramUri);
      new StringBuilder(12 + String.valueOf(str10).length()).append("Unknown URI ").append(str10);
      return null;
    }
    Context localContext = getContext();
    String str3 = String.valueOf("drt_");
    String str4 = String.valueOf(str2);
    String str5;
    SharedPreferences localSharedPreferences;
    String str6;
    if (str4.length() != 0)
    {
      str5 = str3.concat(str4);
      localSharedPreferences = localContext.getSharedPreferences(str5, 0);
      str6 = localSharedPreferences.getString("drt", null);
      if (str6 == null) {
        break label453;
      }
      Long localLong = Long.valueOf(localSharedPreferences.getLong("drt_expiry", -1L));
      if (System.currentTimeMillis() >= localLong.longValue()) {
        break label447;
      }
    }
    label447:
    for (int k = 1;; k = 0)
    {
      if (k == 0) {
        break label453;
      }
      return a(paramArrayOfString1, str6);
      str5 = new String(str3);
      break;
    }
    label453:
    gvo localgvo = new gvo(getContext(), new kcg(getContext(), j));
    ((kbu)mbb.a(getContext(), kbu.class)).a(localgvo);
    HttpCookie localHttpCookie = localgvo.a;
    if (localHttpCookie == null) {
      return a(paramArrayOfString1, "");
    }
    String str7 = String.valueOf("_drt_=");
    String str8 = String.valueOf(localHttpCookie.getValue());
    if (str8.length() != 0) {}
    for (String str9 = str7.concat(str8);; str9 = new String(str7))
    {
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putString("drt", str9);
      localEditor.putLong("drt_expiry", System.currentTimeMillis() + 1000L * localHttpCookie.getMaxAge());
      localEditor.commit();
      return a(paramArrayOfString1, str9);
    }
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.adsprovider.AdsProvider
 * JD-Core Version:    0.7.0.1
 */