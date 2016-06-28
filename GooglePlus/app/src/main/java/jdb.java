import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteException;

public final class jdb
  extends CursorWrapper
{
  private static final String a = jdr.a(jdb.class);
  
  public jdb(Cursor paramCursor)
  {
    super(paramCursor);
  }
  
  public final long a()
  {
    try
    {
      long l = getLong(getColumnIndex("last_modified_version"));
      return l;
    }
    catch (Exception localException) {}
    return 0L;
  }
  
  public final long b()
  {
    try
    {
      long l = getLong(getColumnIndex("system_tray_version"));
      return l;
    }
    catch (Exception localException) {}
    return 0L;
  }
  
  public final mkl c()
  {
    try
    {
      byte[] arrayOfByte = getBlob(getColumnIndex("expanded_info"));
      if (arrayOfByte != null)
      {
        mkl localmkl = new mkl();
        qat.b(localmkl, arrayOfByte, 0, arrayOfByte.length);
        return localmkl;
      }
    }
    catch (qas localqas)
    {
      jdr.b(a, "Malformed ExpandedInfo data for notification.", localqas);
      return null;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        jdr.b(a, "ExpandedInfo not in db", localSQLiteException);
      }
    }
  }
  
  public final int d()
  {
    try
    {
      int i = getInt(getColumnIndex("read_state"));
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public final int e()
  {
    mkc localmkc = m();
    if (localmkc != null) {}
    switch (efj.a(Integer.valueOf(localmkc.b)))
    {
    case 0: 
    default: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return -1;
    case 3: 
      return 2;
    }
    return -2;
  }
  
  public final Long f()
  {
    mkf localmkf = k();
    if ((localmkf != null) && (localmkf.b != null)) {
      return Long.valueOf(localmkf.b.longValue() / 1000L);
    }
    return Long.valueOf(0L);
  }
  
  public final mke g()
  {
    try
    {
      byte[] arrayOfByte = getBlob(getColumnIndex("payload"));
      if (arrayOfByte != null)
      {
        mke localmke = (mke)qat.b(new mke(), arrayOfByte, 0, arrayOfByte.length);
        return localmke;
      }
    }
    catch (Exception localException)
    {
      jdr.b(a, "Exception trying to parse payload protocol buffer.", localException);
    }
    return null;
  }
  
  public final mjc h()
  {
    for (;;)
    {
      try
      {
        byte[] arrayOfByte = getBlob(getColumnIndex("analytics_data"));
        if (arrayOfByte != null)
        {
          localmjc = (mjc)qat.b(new mjc(), arrayOfByte, 0, arrayOfByte.length);
          return localmjc;
        }
      }
      catch (qas localqas)
      {
        jdr.b(a, "Malformed analytics data for notification.", localqas);
        return null;
      }
      catch (SQLiteException localSQLiteException)
      {
        jdr.b(a, "AnalyticsData not in db.", localSQLiteException);
        return null;
      }
      mjc localmjc = null;
    }
  }
  
  public final String i()
  {
    mkf localmkf = k();
    if ((localmkf != null) && (localmkf.c != null)) {
      return localmkf.c.a;
    }
    return null;
  }
  
  public final String j()
  {
    mkc localmkc = m();
    if (localmkc != null) {
      return localmkc.a;
    }
    return null;
  }
  
  public final mkf k()
  {
    try
    {
      byte[] arrayOfByte = getBlob(getColumnIndex("collapsed_info"));
      if (arrayOfByte != null)
      {
        mkf localmkf = new mkf();
        qat.b(localmkf, arrayOfByte, 0, arrayOfByte.length);
        return localmkf;
      }
    }
    catch (qas localqas)
    {
      jdr.b(a, "Malformed CollapsedInfo data for notification.", localqas);
      return null;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        jdr.b(a, "CollapsedInfo not in db", localSQLiteException);
      }
    }
  }
  
  public final boolean l()
  {
    mkc localmkc = m();
    return (localmkc != null) && (efj.b(localmkc.c));
  }
  
  public final mkc m()
  {
    try
    {
      byte[] arrayOfByte = getBlob(getColumnIndex("android_render_info"));
      if (arrayOfByte != null)
      {
        mkc localmkc = new mkc();
        qat.b(localmkc, arrayOfByte, 0, arrayOfByte.length);
        return localmkc;
      }
    }
    catch (qas localqas)
    {
      jdr.b(a, "Malformed AndroidRenderInfo data for notification.", localqas);
      return null;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        jdr.b(a, "AndroidRenderInfo not in db", localSQLiteException);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdb
 * JD-Core Version:    0.7.0.1
 */