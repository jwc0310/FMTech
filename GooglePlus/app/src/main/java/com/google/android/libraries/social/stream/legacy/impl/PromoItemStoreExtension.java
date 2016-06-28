package com.google.android.libraries.social.stream.legacy.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.ArrayList;
import java.util.Arrays;
import llm;
import lod;
import oqw;

@UsedByReflection
public final class PromoItemStoreExtension
  implements llm
{
  private static final String a = PromoItemStoreExtension.class.getSimpleName();
  private static final ArrayList<Integer> b;
  private final Context c;
  private ContentValues d = new ContentValues(3);
  private ArrayList<oqw> e = new ArrayList(1);
  
  static
  {
    Integer[] arrayOfInteger = new Integer[3];
    arrayOfInteger[0] = Integer.valueOf(4);
    arrayOfInteger[1] = Integer.valueOf(7);
    arrayOfInteger[2] = Integer.valueOf(8);
    b = new ArrayList(Arrays.asList(arrayOfInteger));
  }
  
  public PromoItemStoreExtension(Context paramContext)
  {
    this.c = paramContext;
  }
  
  private static String a(Context paramContext, int paramInt, oqw paramoqw)
  {
    if ((paramoqw == null) || (paramoqw.a != 2)) {
      return null;
    }
    return lod.a(paramContext, paramInt, paramoqw);
  }
  
  public final String a(int paramInt, oqw paramoqw)
  {
    return a(this.c, paramInt, paramoqw);
  }
  
  public final ArrayList<Integer> a(Context paramContext, int paramInt)
  {
    return b;
  }
  
  public final void a(Context paramContext, int paramInt1, SQLiteDatabase paramSQLiteDatabase, oqw paramoqw, int paramInt2, boolean paramBoolean)
  {
    if ((paramoqw == null) || (paramoqw.a != 2) || (paramoqw.c == null))
    {
      Log.e(a, "Update is missing");
      return;
    }
    this.e.clear();
    this.e.add(paramoqw);
    lod.a(paramContext, paramInt1, paramSQLiteDatabase, this.e);
    this.e.clear();
  }
  
  public final boolean a(int paramInt)
  {
    return true;
  }
  
  public final boolean a(Context paramContext, int paramInt1, SQLiteDatabase paramSQLiteDatabase, oqw paramoqw, String paramString1, long paramLong, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    String str = a(paramContext, paramInt1, paramoqw);
    if (TextUtils.isEmpty(str))
    {
      Log.e(a, "Update is missing activity ID");
      return false;
    }
    this.d.clear();
    this.d.put("stream_key", paramString1);
    this.d.put("unique_activity_id", str);
    this.d.put("sort_index", Integer.valueOf(paramInt2));
    this.d.put("stream_fetch_timestamp", Long.valueOf(paramLong));
    paramSQLiteDatabase.insertWithOnConflict("activity_streams", "unique_activity_id", this.d, 5);
    this.d.clear();
    return true;
  }
  
  public final ArrayList<Integer> b(Context paramContext, int paramInt)
  {
    return null;
  }
  
  public final ArrayList<Integer> c(Context paramContext, int paramInt)
  {
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.stream.legacy.impl.PromoItemStoreExtension
 * JD-Core Version:    0.7.0.1
 */