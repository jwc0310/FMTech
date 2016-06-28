import android.net.Uri;

public final class ijl
{
  private static final Uri a = Uri.parse("content://com.google.settings/partner");
  
  /* Error */
  public static int a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 29	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   6: astore_2
    //   7: aload_2
    //   8: getstatic 18	ijl:a	Landroid/net/Uri;
    //   11: iconst_1
    //   12: anewarray 31	java/lang/String
    //   15: dup
    //   16: iconst_0
    //   17: ldc 33
    //   19: aastore
    //   20: ldc 35
    //   22: iconst_1
    //   23: anewarray 31	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: ldc 37
    //   30: aastore
    //   31: aconst_null
    //   32: invokevirtual 43	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   35: astore 10
    //   37: aload 10
    //   39: astore 5
    //   41: aconst_null
    //   42: astore 6
    //   44: aload 5
    //   46: ifnull +34 -> 80
    //   49: aload 5
    //   51: invokeinterface 49 1 0
    //   56: istore 13
    //   58: aconst_null
    //   59: astore 6
    //   61: iload 13
    //   63: ifeq +17 -> 80
    //   66: aload 5
    //   68: iconst_0
    //   69: invokeinterface 53 2 0
    //   74: astore 14
    //   76: aload 14
    //   78: astore 6
    //   80: aload 5
    //   82: ifnull +10 -> 92
    //   85: aload 5
    //   87: invokeinterface 56 1 0
    //   92: aload 6
    //   94: ifnonnull +44 -> 138
    //   97: iconst_2
    //   98: ireturn
    //   99: astore 4
    //   101: aconst_null
    //   102: astore 5
    //   104: aconst_null
    //   105: astore 6
    //   107: aload 5
    //   109: ifnull -17 -> 92
    //   112: aload 5
    //   114: invokeinterface 56 1 0
    //   119: aconst_null
    //   120: astore 6
    //   122: goto -30 -> 92
    //   125: astore_3
    //   126: aload_1
    //   127: ifnull +9 -> 136
    //   130: aload_1
    //   131: invokeinterface 56 1 0
    //   136: aload_3
    //   137: athrow
    //   138: aload 6
    //   140: invokestatic 62	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   143: istore 9
    //   145: iload 9
    //   147: istore 8
    //   149: iload 8
    //   151: ireturn
    //   152: astore 7
    //   154: iconst_2
    //   155: istore 8
    //   157: goto -8 -> 149
    //   160: astore 12
    //   162: aload 5
    //   164: astore_1
    //   165: aload 12
    //   167: astore_3
    //   168: goto -42 -> 126
    //   171: astore 11
    //   173: goto -69 -> 104
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	paramContext	android.content.Context
    //   1	164	1	localObject1	Object
    //   6	2	2	localContentResolver	android.content.ContentResolver
    //   125	12	3	localObject2	Object
    //   167	1	3	localObject3	Object
    //   99	1	4	localRuntimeException1	java.lang.RuntimeException
    //   39	124	5	localCursor1	android.database.Cursor
    //   42	97	6	localObject4	Object
    //   152	1	7	localNumberFormatException	java.lang.NumberFormatException
    //   147	9	8	i	int
    //   143	3	9	j	int
    //   35	3	10	localCursor2	android.database.Cursor
    //   171	1	11	localRuntimeException2	java.lang.RuntimeException
    //   160	6	12	localObject5	Object
    //   56	6	13	bool	boolean
    //   74	3	14	str	java.lang.String
    // Exception table:
    //   from	to	target	type
    //   7	37	99	java/lang/RuntimeException
    //   7	37	125	finally
    //   138	145	152	java/lang/NumberFormatException
    //   49	58	160	finally
    //   66	76	160	finally
    //   49	58	171	java/lang/RuntimeException
    //   66	76	171	java/lang/RuntimeException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ijl
 * JD-Core Version:    0.7.0.1
 */