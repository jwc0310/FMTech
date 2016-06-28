import android.content.Context;

final class hbt
{
  final Context a;
  final String b;
  
  public hbt(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }
  
  /* Error */
  public final java.util.Set<String> a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	hbt:a	Landroid/content/Context;
    //   4: invokestatic 26	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   7: aload_0
    //   8: getfield 17	hbt:b	Ljava/lang/String;
    //   11: aconst_null
    //   12: invokeinterface 32 3 0
    //   17: astore_1
    //   18: new 34	java/util/HashSet
    //   21: dup
    //   22: invokespecial 35	java/util/HashSet:<init>	()V
    //   25: astore_2
    //   26: aload_1
    //   27: ifnonnull +5 -> 32
    //   30: aload_2
    //   31: areturn
    //   32: new 37	org/json/JSONArray
    //   35: dup
    //   36: aload_1
    //   37: invokespecial 40	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   40: astore_3
    //   41: iconst_0
    //   42: istore 4
    //   44: iload 4
    //   46: aload_3
    //   47: invokevirtual 44	org/json/JSONArray:length	()I
    //   50: if_icmpge -20 -> 30
    //   53: aload_2
    //   54: aload_3
    //   55: iload 4
    //   57: invokevirtual 47	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   60: invokeinterface 53 2 0
    //   65: pop
    //   66: iinc 4 1
    //   69: goto -25 -> 44
    //   72: astore 5
    //   74: new 55	java/lang/RuntimeException
    //   77: dup
    //   78: ldc 57
    //   80: aload 5
    //   82: invokespecial 60	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	hbt
    //   17	20	1	str	String
    //   25	29	2	localHashSet	java.util.HashSet
    //   40	15	3	localJSONArray	org.json.JSONArray
    //   42	25	4	i	int
    //   72	9	5	localJSONException	org.json.JSONException
    // Exception table:
    //   from	to	target	type
    //   32	41	72	org/json/JSONException
    //   44	66	72	org/json/JSONException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbt
 * JD-Core Version:    0.7.0.1
 */