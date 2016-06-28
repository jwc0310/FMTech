import android.support.rastermill.FrameSequence;

public final class ifb
{
  public final FrameSequence a;
  
  public ifb(FrameSequence paramFrameSequence)
  {
    this.a = paramFrameSequence;
  }
  
  /* Error */
  public static boolean a(java.nio.ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: invokevirtual 20	java/nio/ByteBuffer:remaining	()I
    //   6: bipush 21
    //   8: if_icmpge +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: iconst_0
    //   15: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   18: bipush 82
    //   20: if_icmpne +141 -> 161
    //   23: aload_0
    //   24: iconst_1
    //   25: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   28: bipush 73
    //   30: if_icmpne +131 -> 161
    //   33: aload_0
    //   34: iconst_2
    //   35: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   38: bipush 70
    //   40: if_icmpne +121 -> 161
    //   43: aload_0
    //   44: iconst_3
    //   45: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   48: bipush 70
    //   50: if_icmpne +111 -> 161
    //   53: aload_0
    //   54: bipush 8
    //   56: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   59: bipush 87
    //   61: if_icmpne +100 -> 161
    //   64: aload_0
    //   65: bipush 9
    //   67: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   70: bipush 69
    //   72: if_icmpne +89 -> 161
    //   75: aload_0
    //   76: bipush 10
    //   78: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   81: bipush 66
    //   83: if_icmpne +78 -> 161
    //   86: aload_0
    //   87: bipush 11
    //   89: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   92: bipush 80
    //   94: if_icmpne +67 -> 161
    //   97: aload_0
    //   98: bipush 12
    //   100: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   103: bipush 86
    //   105: if_icmpne +56 -> 161
    //   108: aload_0
    //   109: bipush 13
    //   111: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   114: bipush 80
    //   116: if_icmpne +45 -> 161
    //   119: aload_0
    //   120: bipush 14
    //   122: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   125: bipush 56
    //   127: if_icmpne +34 -> 161
    //   130: aload_0
    //   131: bipush 15
    //   133: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   136: istore 8
    //   138: iload 8
    //   140: bipush 88
    //   142: if_icmpne +19 -> 161
    //   145: iload_1
    //   146: istore 4
    //   148: iload 4
    //   150: ifne +17 -> 167
    //   153: aload_0
    //   154: iconst_0
    //   155: invokevirtual 28	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   158: pop
    //   159: iconst_0
    //   160: ireturn
    //   161: iconst_0
    //   162: istore 4
    //   164: goto -16 -> 148
    //   167: aload_0
    //   168: bipush 20
    //   170: invokevirtual 24	java/nio/ByteBuffer:get	(I)B
    //   173: istore 5
    //   175: iload 5
    //   177: iconst_2
    //   178: iand
    //   179: ifeq +11 -> 190
    //   182: aload_0
    //   183: iconst_0
    //   184: invokevirtual 28	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   187: pop
    //   188: iload_1
    //   189: ireturn
    //   190: iconst_0
    //   191: istore_1
    //   192: goto -10 -> 182
    //   195: astore_2
    //   196: aload_0
    //   197: iconst_0
    //   198: invokevirtual 28	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   201: pop
    //   202: aload_2
    //   203: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	paramByteBuffer	java.nio.ByteBuffer
    //   1	191	1	bool1	boolean
    //   195	8	2	localObject	Object
    //   146	17	4	bool2	boolean
    //   173	6	5	i	int
    //   136	7	8	j	int
    // Exception table:
    //   from	to	target	type
    //   13	138	195	finally
    //   167	175	195	finally
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ifb
 * JD-Core Version:    0.7.0.1
 */