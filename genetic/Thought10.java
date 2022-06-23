package genetic;
import java.util.ArrayList;
class Thought10 extends Thought{
private static ArrayList<Thought10> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 14.076520115759648;
private double fd1 = 17.564820579239353;
private Thought fo0 = null;
private Thought fo1 = null;
Thought10 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought10 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought10 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought10 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought10 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought10 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought10 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought10 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought10 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 681.3422240504931;
    fb1 = ld0 < fd0;
    fb0 = fb1 && fb0;
    double ld1 = 108.62573629977604;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought34.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    fb0 = fb1 && lb3;
    ld0 = ld1 + fd0;
    boolean lb4 = true;
    lb4 = fd1 < ld0;
    Thought lo5 = Thought99.getInstance(ld1, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, lb4);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb0, fb1, lb3, lb4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    Thought lo0 = Thought0.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = true;
    double ld2 = 346.30838711307786;
    fd0 = fd1 + ld2;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb1, ab1);
}
    Output.points[5][3] += fd1;
    ab2 = ld2 < fd0;
    ab3 = fd1 < ld2;
    fd0 = fd1 - ld2;
    Output.points[5][4] -= fd0;
    fd1 = ld2 - fd0;
if(fo1 != null){
      fo1.m3();
}
    boolean lb3 = true;
    ab3 = fd1 < ld2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[5][5] += fd1;
    Thought lo0 = Thought35.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld1 = 272.8781282057045;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad1 < ad2;
        ad3 = ad4 - fd0;
        fb1 = fd1 < ld1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        ad2 = ad3 + ad4;
        fb0 = !fb1;
        fb0 = !fb1;
        boolean lb2 = true;
        fd0 = fd1 - ld1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    Thought lo0 = Thought5.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < ad1;
    Thought lo1 = Thought55.getInstance();
    ab2 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ab3 = ab4 || fb0;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb2 = true;
    Thought lo3 = Thought58.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    boolean lb4 = true;
    if (ab4) {
        fb0 = fb1 && lb2;
        lb4 = !ab1;
        boolean lb5 = false;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    if (fb1) {
        fd0 *= -1;
        Output.points[5][6] -= fd1;
        fd0 = fd1 - fd0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          fd1 = ao4.m3(fd0, fd1, fd0, fd1);
}
        fb1 = fb0 && fb1;
        fd0 *= -1;
        fb0 = !fb1;
if(fo0 != null){
          fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought53.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        fb0 = fd0 > fd1;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    fb0 = ad4 < fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    double ld0 = 795.7718294747502;
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, lb2, lb3, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, lb2, lb3);
}
    ld0 *= -1;
    fb0 = ad1 < ad2;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        Thought lo0 = Thought27.getInstance();
        if (fb1) {
            double ld1 = 664.5007555921459;
            boolean lb2 = false;
if(ao3 != null){
              lb2 = ao3.m2(fd0, fd1, ld1, fd0);
}
            fd1 *= -1;
            double ld3 = 591.8268460149892;
            ab1 = ld1 > ld3;
if(fo0 != null){
              ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
            fb1 = fd0 < fd1;
            boolean lb4 = true;
            Thought lo5 = Thought76.getInstance(fo1, ao1, ao2, ao3, ld1, ld3, fd0, fd1);
            boolean lb6 = false;
            boolean lb7 = false;
if(ao4 != null){
              ld1 = ao4.m3(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld1, lb2, lb4, lb6, lb7);
}
            ab1 = !ab2;
if(ao3 != null){
              ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb2);
}
if(ao2 != null){
              ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
              ao1 = ao2.m4(ld3, fd0, fd1, ld1, lb4, lb6, lb7, ab1);
}
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = fd1 < ad1;
    Thought lo0 = Thought27.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = ad4 > fd0;
    ab1 = !ab2;
    boolean lb1 = false;
    fd1 = ad1 + ad2;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb1;
if(ao3 != null){
      ao3.m1(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4);
}
        boolean lb2 = true;
    boolean lb3 = false;
if(ao1 != null){
      lb3 = ao1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb1 = lb2 && lb3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld0 = 134.27209028566224;
    Thought lo1 = Thought52.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    double ld2 = 490.5931617886839;
    boolean lb3 = true;
    fd0 = fd1 - ld2;
    ab2 = ab3 || ab4;
    Output.points[5][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    lb3 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb3, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought4.getInstance(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
    Thought lo5 = Thought21.getInstance();
    fb1 = lb0 && lb1;
    Thought lo6 = Thought19.getInstance(fd1, ld2, fd0, fd1);
    lb3 = ld2 < fd0;
    boolean lb7 = false;
if(fo1 != null){
      lb7 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + ld2;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 = ad4 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought13.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 + ad2;
    Thought lo2 = Thought55.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
    Output.points[5][8] -= ad1;
        lb0 = ad2 < ad3;
if(fo1 != null){
      fb0 = fo1.m2();
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(lb0, ab1, ab2, ab3);
}
        boolean lb1 = true;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    double ld2 = 860.8820374404614;
    Output.points[6][0] += ad3;
    lb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
        Output.points[6][1] += ad1;
    boolean lb3 = false;
    ad2 = ad3 - ad4;
if(fo0 != null){
      lb0 = fo0.m2();
}
    lb1 = fd0 < fd1;
    lb3 = ab1 || ab2;
    ab3 = ld2 < ad1;
    Output.points[6][2] -= ad2;
    if (ab4) {
        } else if (fb0) {
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    double ld0 = 988.1045572827067;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought21.getInstance(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
    Output.points[6][3] += ld0;
    fb0 = fb1 && lb1;
    fd0 = fd1 + ld0;
    fb0 = fd0 < fd1;
    fb1 = !lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && lb1;
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[6][4] += fd0;
if(ao3 != null){
      ao3.m2();
}
    fb0 = !fb1;
    Thought lo0 = Thought8.getInstance(fd1, ad1, ad2, ad3);
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 && lb1;
            ad4 = fd0 - fd1;
            ad1 = ad2 - ad3;
            fb0 = ad4 > fd0;
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
            double ld2 = 982.5575304423523;
if(ao4 != null){
              ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
if(ao3 != null){
              ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
            fb0 = !fb1;
if(ao3 != null){
              ao2 = ao3.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
            Thought lo3 = Thought40.getInstance();
            fd1 *= -1;
            double ld4 = 203.7742030034256;
            ld2 = ld4 - ad1;
            ad2 = ad3 + ad4;
            }
        Thought lo5 = Thought10.getInstance(ad1, ad2, ad3, ad4);
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 486.2425180176743;
    boolean lb1 = true;
    lb1 = ld0 < fd0;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3(ab4, fb0, fb1, lb1);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
        }
    fd0 = fd1 + ld0;
    double ld2 = 867.1721112545604;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo3 = Thought74.getInstance(fd0, fd1, ld0, ld2, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[6][5] -= fd0;
    fb1 = lb1 && ab1;
    double ld4 = 391.9009476229809;
    fd0 = fd1 + ld0;
        ld2 = ld4 - fd0;
    fd1 = ld0 + ld2;
if(ao3 != null){
      ao2 = ao3.m4(ld4, fd0, fd1, ld0);
}
if(ao4 != null){
      ao4.m1(ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought19.getInstance(fo0, fo1, ao1, ao2, ld2, ld4, fd0, fd1);
    boolean lb6 = false;
    ld0 = ld2 - ld4;
    fb0 = fb1 && lb1;
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return lb6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought92.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought87.getInstance(ad3, ad4, fd0, fd1);
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m2(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ab3 = ad3 > ad4;
    fd0 = fd1 - ad1;
    ab4 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    double ld2 = 703.1656979610506;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 759.008737176788;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    double ld2 = 77.30245495422858;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      fo1.m2(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
    fb0 = fb1 && lb1;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought41.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;
    Output.points[6][6] -= ld2;
    fb1 = lb1 || fb0;
    fb1 = fd0 < fd1;
    double ld4 = 967.6974812341052;
    lb1 = !fb0;
    ld0 *= -1;

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 526.9598986353318;
    if (ab1) {
        ld0 *= -1;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - ld0;
        Output.points[6][7] -= fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb1 = fo0.m2(fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
}
        ld0 *= -1;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought73.getInstance();
    double ld2 = 43.034152577916444;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3);
}
    double ld3 = 83.20515650379953;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    Output.points[6][8] += ad3;
    Thought lo4 = Thought81.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
    fb1 = !lb0;
    ld3 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[7][0] += ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb5 = false;
    lb0 = lb5 && fb0;
    ld3 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        double ld6 = 644.368743939156;
        boolean lb7 = true;
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb7, lb0);
}
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        }
    Thought lo0 = Thought96.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb1 = false;
    lb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    Thought lo3 = Thought77.getInstance(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought95.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 908.1910391539731;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    Output.points[7][1] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought69.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    Output.points[7][2] += fd1;
    fb0 = ld1 < fd0;
    Output.points[7][3] += fd1;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        fb0 = ad2 > ad3;
        double ld0 = 961.8267911315387;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb0 = !fb1;
        Output.points[7][4] += ld0;
        double ld1 = 423.8091302582545;
        fb0 = fb1 || fb0;
if(ao1 != null){
          ld1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
        fb0 = !fb1;
        Thought lo3 = Thought94.getInstance(fo1, ao1, ao2, ao3);
        fd0 = fd1 + ld0;
        lb2 = fb0 && fb1;
        lb2 = !fb0;
        fb1 = lb2 && fb0;
        fb1 = ld1 > ad1;
        ad2 = ad3 - ad4;
        boolean lb4 = false;
        lb2 = lb4 || fb0;
        fd0 = fd1 - ld0;
        fb1 = lb2 && lb4;
        fb0 = ld1 < ad1;
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, lb2, lb4, fb0);
}
        Output.points[7][5] += fd1;
        double ld5 = 3.6295651810959133;
        fb1 = ld0 > ld1;
if(ao1 != null){
          fo1 = ao1.m4();
}
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    if (ab4) {
        fb0 = !fb1;
        boolean lb0 = true;
        fd0 = fd1 - fd0;
        lb0 = fd1 < fd0;
        fd1 *= -1;
        ab1 = ab2 || ab3;
        Thought lo1 = Thought89.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        ab1 = !ab2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb2 = true;
        double ld3 = 445.4825323412897;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb0, lb2, ab1, ab2);
}
        ab3 = fd1 > ld3;
        ab4 = fb0 || fb1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          lb0 = ao1.m2(fd0, fd1, ld3, fd0, lb2, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        boolean lb4 = true;
        fd1 = ld3 - fd0;
        double ld5 = 506.73254820915207;
        lb0 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ld3, ld5, fd0, fd1);
}
        double ld6 = 402.82223572792304;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab1 = !ab2;
    Output.points[7][6] += ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Output.points[7][7] -= ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ad1 > ad2;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought89.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought52.getInstance(fo0, fo1, fo0, fo1);
    lb1 = fd0 > fd1;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb2, lb4, fb0, fb1);
}
        lb1 = fd0 > fd1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = !ab3;
    fd1 = fd0 - fd1;
        Output.points[7][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
        ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought21.getInstance();
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    double ld2 = 773.0366357842042;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
}
    Output.points[8][0] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    double ld3 = 279.4547504207005;
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    boolean lb0 = false;
    double ld1 = 106.53785527245064;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo3 = Thought62.getInstance(ld1, ad1, ad2, ad3);
    ad4 *= -1;
    lb2 = fd0 > fd1;
    ab1 = ld1 < ad1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }

return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[8][1] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    fd0 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought12.getInstance();

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        ab3 = fd1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
        ab4 = fb0 && fb1;
        Output.points[8][2] -= fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        } else {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
        boolean lb0 = true;
        Thought lo1 = Thought71.getInstance(fd1, fd0, fd1, fd0);
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              ao3.m1(ab2, ab3, ab4, fb0);
}
            fb1 = lb0 && ab1;
}}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      lb0 = ao1.m2();
}
    ad2 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 *= -1;
    boolean lb1 = true;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ab1 = ad1 > ad2;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    lb1 = ad2 > ad3;
        boolean lb2 = false;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        Output.points[8][3] += ad4;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
          lb2 = ao2.m2(lb3, ab1, ab2, ab3);
}
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought4.getInstance();
    Output.points[8][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    double ld1 = 801.9781794366655;
    Output.points[8][5] -= ld1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 863.7106167886856;
    fb0 = fb1 || fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought86.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    double ld1 = 370.3738333228829;
    boolean lb2 = false;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3(lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought89.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = fd1 > ld1;
    Thought lo4 = Thought7.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
    fb0 = fb1 || lb0;
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought5.getInstance(fb0, fb1, lb0, fb0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
