import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class iao
{
  private static final String[] c = { "TEXT", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "REAL", "REAL", "NONE" };
  public final String a;
  public final String[] b;
  private final iap[] d;
  private final boolean e;
  
  public iao(Class<? extends ial> paramClass)
  {
    iap[] arrayOfiap = a(paramClass);
    ian localian = (ian)paramClass.getAnnotation(ian.class);
    if (localian == null) {}
    String[] arrayOfString;
    for (String str = null;; str = localian.a())
    {
      this.a = str;
      this.d = arrayOfiap;
      arrayOfString = new String[arrayOfiap.length];
      for (int i = 0; i != arrayOfiap.length; i++)
      {
        iap localiap = arrayOfiap[i];
        arrayOfString[i] = localiap.a;
        if (localiap.d) {
          bool = true;
        }
      }
    }
    this.b = arrayOfString;
    this.e = bool;
  }
  
  private iap a(String paramString)
  {
    iap[] arrayOfiap = this.d;
    int i = arrayOfiap.length;
    int j = 0;
    iap localiap;
    if (j < i)
    {
      localiap = arrayOfiap[j];
      if (!localiap.a.equals(paramString)) {}
    }
    for (int k = localiap.h;; k = -1)
    {
      if (k >= 0) {
        break label61;
      }
      return null;
      j++;
      break;
    }
    label61:
    return this.d[k];
  }
  
  private void a(ial paramial, ContentValues paramContentValues)
  {
    for (;;)
    {
      int j;
      String str;
      Field localField;
      try
      {
        iap[] arrayOfiap = this.d;
        int i = arrayOfiap.length;
        j = 0;
        if (j >= i) {
          break label246;
        }
        iap localiap = arrayOfiap[j];
        str = localiap.a;
        localField = localiap.g;
        switch (localiap.b)
        {
        case 0: 
          paramContentValues.put(str, (String)localField.get(paramial));
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new RuntimeException(localIllegalAccessException);
      }
      paramContentValues.put(str, Boolean.valueOf(localField.getBoolean(paramial)));
      break label247;
      paramContentValues.put(str, Short.valueOf(localField.getShort(paramial)));
      break label247;
      paramContentValues.put(str, Integer.valueOf(localField.getInt(paramial)));
      break label247;
      paramContentValues.put(str, Long.valueOf(localField.getLong(paramial)));
      break label247;
      paramContentValues.put(str, Float.valueOf(localField.getFloat(paramial)));
      break label247;
      paramContentValues.put(str, Double.valueOf(localField.getDouble(paramial)));
      break label247;
      paramContentValues.put(str, (byte[])localField.get(paramial));
      break label247;
      label246:
      return;
      label247:
      j++;
    }
  }
  
  private static void a(Class<? extends Object> paramClass, ArrayList<iap> paramArrayList)
  {
    Field[] arrayOfField = paramClass.getDeclaredFields();
    int i = 0;
    if (i != arrayOfField.length)
    {
      Field localField = arrayOfField[i];
      iam localiam = (iam)localField.getAnnotation(iam.class);
      Class localClass;
      int j;
      if (localiam != null)
      {
        localClass = localField.getType();
        if (localClass != String.class) {
          break label117;
        }
        j = 0;
      }
      for (;;)
      {
        int k = paramArrayList.size();
        paramArrayList.add(new iap(localiam.a(), j, localiam.b(), localiam.c(), localiam.d(), localiam.e(), localField, k));
        i++;
        break;
        label117:
        if (localClass == Boolean.TYPE)
        {
          j = 1;
        }
        else if (localClass == Short.TYPE)
        {
          j = 2;
        }
        else if (localClass == Integer.TYPE)
        {
          j = 3;
        }
        else if (localClass == Long.TYPE)
        {
          j = 4;
        }
        else if (localClass == Float.TYPE)
        {
          j = 5;
        }
        else if (localClass == Double.TYPE)
        {
          j = 6;
        }
        else
        {
          if (localClass != [B.class) {
            break label216;
          }
          j = 7;
        }
      }
      label216:
      String str1 = String.valueOf(localClass.getName());
      if (str1.length() != 0) {}
      for (String str2 = "Unsupported field type for column: ".concat(str1);; str2 = new String("Unsupported field type for column: ")) {
        throw new IllegalArgumentException(str2);
      }
    }
  }
  
  private final iap[] a(Class<? extends Object> paramClass)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramClass != null)
    {
      a(paramClass, localArrayList);
      paramClass = paramClass.getSuperclass();
    }
    iap[] arrayOfiap = new iap[localArrayList.size()];
    localArrayList.toArray(arrayOfiap);
    return arrayOfiap;
  }
  
  public final long a(SQLiteDatabase paramSQLiteDatabase, ial paramial)
  {
    ContentValues localContentValues = new ContentValues();
    a(paramial, localContentValues);
    if (paramial.id == 0L) {
      localContentValues.remove("_id");
    }
    long l = paramSQLiteDatabase.replace(this.a, "_id", localContentValues);
    paramial.id = l;
    return l;
  }
  
  public final <T extends ial> T a(ContentValues paramContentValues, T paramT)
  {
    for (;;)
    {
      int j;
      String str1;
      Field localField;
      try
      {
        iap[] arrayOfiap = this.d;
        int i = arrayOfiap.length;
        j = 0;
        if (j >= i) {
          break label294;
        }
        iap localiap = arrayOfiap[j];
        str1 = localiap.a;
        localField = localiap.g;
        switch (localiap.b)
        {
        case 0: 
          String str2 = paramContentValues.getAsString(str1);
          if (str2 == null) {
            break label296;
          }
          localField.set(paramT, str2);
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new RuntimeException(localIllegalAccessException);
      }
      Boolean localBoolean = paramContentValues.getAsBoolean(str1);
      if (localBoolean != null)
      {
        localField.set(paramT, localBoolean);
        break label296;
        Short localShort = paramContentValues.getAsShort(str1);
        if (localShort != null)
        {
          localField.set(paramT, localShort);
          break label296;
          Integer localInteger = paramContentValues.getAsInteger(str1);
          if (localInteger != null)
          {
            localField.set(paramT, localInteger);
            break label296;
            Long localLong = paramContentValues.getAsLong(str1);
            if (localLong != null)
            {
              localField.set(paramT, localLong);
              break label296;
              Float localFloat = paramContentValues.getAsFloat(str1);
              if (localFloat != null)
              {
                localField.set(paramT, localFloat);
                break label296;
                Double localDouble = paramContentValues.getAsDouble(str1);
                if (localDouble != null)
                {
                  localField.set(paramT, localDouble);
                  break label296;
                  byte[] arrayOfByte = paramContentValues.getAsByteArray(str1);
                  if (arrayOfByte != null)
                  {
                    localField.set(paramT, arrayOfByte);
                    break label296;
                    label294:
                    return paramT;
                  }
                }
              }
            }
          }
        }
      }
      label296:
      j++;
    }
  }
  
  public final <T extends ial> T a(Cursor paramCursor, T paramT)
  {
    int j;
    int k;
    Field localField;
    for (;;)
    {
      try
      {
        iap[] arrayOfiap = this.d;
        int i = arrayOfiap.length;
        j = 0;
        if (j >= i) {
          break;
        }
        iap localiap = arrayOfiap[j];
        k = localiap.h;
        localField = localiap.g;
        switch (localiap.b)
        {
        case 0: 
          if (paramCursor.isNull(k))
          {
            localObject2 = null;
            localField.set(paramT, localObject2);
          }
          break;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new RuntimeException(localIllegalAccessException);
      }
      Object localObject2 = paramCursor.getString(k);
      continue;
      if (paramCursor.getShort(k) != 1) {
        break label301;
      }
    }
    label295:
    label301:
    for (boolean bool = true;; bool = false)
    {
      localField.setBoolean(paramT, bool);
      break label295;
      localField.setShort(paramT, paramCursor.getShort(k));
      break label295;
      localField.setInt(paramT, paramCursor.getInt(k));
      break label295;
      localField.setLong(paramT, paramCursor.getLong(k));
      break label295;
      localField.setFloat(paramT, paramCursor.getFloat(k));
      break label295;
      localField.setDouble(paramT, paramCursor.getDouble(k));
      break label295;
      if (paramCursor.isNull(k)) {}
      byte[] arrayOfByte;
      for (Object localObject1 = null;; localObject1 = arrayOfByte)
      {
        localField.set(paramT, localObject1);
        break;
        arrayOfByte = paramCursor.getBlob(k);
      }
      return paramT;
      j++;
      break;
    }
  }
  
  public final String a(ial paramial, String... paramVarArgs)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ID=").append(paramial.id);
      for (int i = 0; i < 6; i++)
      {
        String str1 = paramVarArgs[i];
        Object localObject = a(str1).g.get(paramial);
        localStringBuilder.append(' ').append(str1).append('=').append(localObject);
      }
      String str2 = localStringBuilder.toString();
      return str2;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    String str1 = this.a;
    if (str1 != null) {}
    StringBuilder localStringBuilder1;
    for (boolean bool = true;; bool = false)
    {
      iaw.a(bool);
      localStringBuilder1 = new StringBuilder("CREATE TABLE ");
      localStringBuilder1.append(str1);
      localStringBuilder1.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT");
      for (iap localiap5 : this.d) {
        if (!"_id".equals(localiap5.a))
        {
          localStringBuilder1.append(',');
          localStringBuilder1.append(localiap5.a);
          localStringBuilder1.append(' ');
          localStringBuilder1.append(c[localiap5.b]);
          if (!localiap5.e) {
            localStringBuilder1.append(" NOT NULL");
          }
          if (!TextUtils.isEmpty(localiap5.f))
          {
            localStringBuilder1.append(" DEFAULT ");
            localStringBuilder1.append(localiap5.f);
          }
        }
      }
    }
    localStringBuilder1.append(");");
    paramSQLiteDatabase.execSQL(localStringBuilder1.toString());
    localStringBuilder1.setLength(0);
    for (iap localiap4 : this.d) {
      if (localiap4.c)
      {
        localStringBuilder1.append("CREATE INDEX ");
        localStringBuilder1.append(str1);
        localStringBuilder1.append("_index_");
        localStringBuilder1.append(localiap4.a);
        localStringBuilder1.append(" ON ");
        localStringBuilder1.append(str1);
        localStringBuilder1.append(" (");
        localStringBuilder1.append(localiap4.a);
        localStringBuilder1.append(");");
        paramSQLiteDatabase.execSQL(localStringBuilder1.toString());
        localStringBuilder1.setLength(0);
      }
    }
    if (this.e)
    {
      String str2 = String.valueOf(str1);
      String str3 = String.valueOf("_fulltext");
      if (str3.length() != 0) {}
      for (String str4 = str2.concat(str3);; str4 = new String(str2))
      {
        localStringBuilder1.append("CREATE VIRTUAL TABLE ");
        localStringBuilder1.append(str4);
        localStringBuilder1.append(" USING FTS3 (_id INTEGER PRIMARY KEY");
        for (iap localiap3 : this.d) {
          if (localiap3.d)
          {
            String str6 = localiap3.a;
            localStringBuilder1.append(',');
            localStringBuilder1.append(str6);
            localStringBuilder1.append(" TEXT");
          }
        }
      }
      localStringBuilder1.append(");");
      paramSQLiteDatabase.execSQL(localStringBuilder1.toString());
      localStringBuilder1.setLength(0);
      StringBuilder localStringBuilder2 = new StringBuilder("INSERT OR REPLACE INTO ");
      localStringBuilder2.append(str4);
      localStringBuilder2.append(" (_id");
      for (iap localiap2 : this.d) {
        if (localiap2.d)
        {
          localStringBuilder2.append(',');
          localStringBuilder2.append(localiap2.a);
        }
      }
      localStringBuilder2.append(") VALUES (new._id");
      for (iap localiap1 : this.d) {
        if (localiap1.d)
        {
          localStringBuilder2.append(",new.");
          localStringBuilder2.append(localiap1.a);
        }
      }
      localStringBuilder2.append(");");
      String str5 = localStringBuilder2.toString();
      localStringBuilder1.append("CREATE TRIGGER ");
      localStringBuilder1.append(str1);
      localStringBuilder1.append("_insert_trigger AFTER INSERT ON ");
      localStringBuilder1.append(str1);
      localStringBuilder1.append(" FOR EACH ROW BEGIN ");
      localStringBuilder1.append(str5);
      localStringBuilder1.append("END;");
      paramSQLiteDatabase.execSQL(localStringBuilder1.toString());
      localStringBuilder1.setLength(0);
      localStringBuilder1.append("CREATE TRIGGER ");
      localStringBuilder1.append(str1);
      localStringBuilder1.append("_update_trigger AFTER UPDATE ON ");
      localStringBuilder1.append(str1);
      localStringBuilder1.append(" FOR EACH ROW BEGIN ");
      localStringBuilder1.append(str5);
      localStringBuilder1.append("END;");
      paramSQLiteDatabase.execSQL(localStringBuilder1.toString());
      localStringBuilder1.setLength(0);
      localStringBuilder1.append("CREATE TRIGGER ");
      localStringBuilder1.append(str1);
      localStringBuilder1.append("_delete_trigger AFTER DELETE ON ");
      localStringBuilder1.append(str1);
      localStringBuilder1.append(" FOR EACH ROW BEGIN DELETE FROM ");
      localStringBuilder1.append(str4);
      localStringBuilder1.append(" WHERE _id = old._id; END;");
      paramSQLiteDatabase.execSQL(localStringBuilder1.toString());
      localStringBuilder1.setLength(0);
    }
  }
  
  public final void b(SQLiteDatabase paramSQLiteDatabase)
  {
    String str = this.a;
    StringBuilder localStringBuilder = new StringBuilder("DROP TABLE IF EXISTS ");
    localStringBuilder.append(str);
    localStringBuilder.append(';');
    paramSQLiteDatabase.execSQL(localStringBuilder.toString());
    localStringBuilder.setLength(0);
    if (this.e)
    {
      localStringBuilder.append("DROP TABLE IF EXISTS ");
      localStringBuilder.append(str);
      localStringBuilder.append("_fulltext");
      localStringBuilder.append(';');
      paramSQLiteDatabase.execSQL(localStringBuilder.toString());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iao
 * JD-Core Version:    0.7.0.1
 */