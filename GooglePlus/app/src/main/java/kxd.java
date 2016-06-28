import java.util.BitSet;

public final class kxd
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final BitSet e;
  
  public kxd(BitSet paramBitSet, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e = paramBitSet;
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public static BitSet a(int... paramVarArgs)
  {
    kxg[] arrayOfkxg = kxg.values();
    BitSet localBitSet = new BitSet(paramVarArgs.length);
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramVarArgs[j];
      if (k >= arrayOfkxg.length) {
        throw new IllegalArgumentException("Values must be ordinal values of a FollowAction");
      }
      localBitSet.set(k);
    }
    return localBitSet;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kxd
 * JD-Core Version:    0.7.0.1
 */