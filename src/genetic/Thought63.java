package genetic;
import java.util.ArrayList;
class Thought63 extends Thought{
private static ArrayList<Thought63> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 224.79972352516495;
private double fd1 = 406.3316736322831;
private Thought fo0 = null;
private Thought fo1 = null;
Thought63 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought63 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought63 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought63 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought63 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought63 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought63 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought63 instance = new Thought63 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Output.points[2][5] += fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
        Output.points[2][6] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = fd0 - fd1;
        double ld1 = 584.7555456518621;
        boolean lb2 = false;
        ld1 = fd0 - fd1;
        ld1 *= -1;
        lb2 = fb0 || fb1;
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
    ab1 = fd1 > fd0;
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd0 = fd1 + fd0;
        boolean lb0 = true;
    boolean lb1 = true;
    Output.points[2][7] -= fd1;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    double ld0 = 480.324320298456;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
    Output.points[2][8] -= ad1;
    Thought lo1 = Thought85.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    Thought lo2 = Thought2.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
        Thought lo3 = Thought97.getInstance(fd1, ld0, ad1, ad2);
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][0] += ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought18.getInstance(fo0, fo1, fo0, fo1);
    Output.points[3][1] += ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought31.getInstance(ab1, ab2, ab3, ab4);
    ad1 = ad2 - ad3;
    Thought lo2 = Thought15.getInstance();
    double ld3 = 66.06807279978956;
    double ld4 = 828.428576837322;

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
    fb0 = fd1 < fd0;
    Output.points[3][2] += fd1;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought80.getInstance(ao4, fo0, fo1, ao1);
    fd0 *= -1;
    Output.points[3][3] += fd1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought83.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought14.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    double ld3 = 466.133149418954;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    boolean lb4 = true;
    Output.points[3][4] -= ld3;
    lb4 = fb0 || fb1;
    lb4 = !fb0;
    fb1 = !lb4;
    fb0 = fd0 > fd1;
    boolean lb5 = false;
    fb0 = fb1 || lb4;
    ld3 = fd0 - fd1;

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
if(ao1 != null){
      ad1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    Output.points[3][5] -= ad2;
if(ao2 != null){
      ad3 = ao2.m3();
}
    boolean lb0 = true;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = ad3 < ad4;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 + fd0;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought44.getInstance(fd1, fd0, fd1, fd0);
        fb1 = !ab1;
    ab2 = ab3 || ab4;
    boolean lb1 = true;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    double ld2 = 450.2482179467541;
    fd0 = fd1 - ld2;

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
    Output.points[3][6] += ad2;
        ab2 = ad3 < ad4;
if(ao2 != null){
      ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    Output.points[3][7] -= fd1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    ab3 = ab4 || fb0;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 934.210748620758;

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
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    lb0 = !fb0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought18.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
    Output.points[3][8] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld4 = 84.36770101742843;
    fd0 = fd1 + ld4;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb0);
}
    double ld5 = 675.3227368308242;
    lb3 = !fb0;
    boolean lb6 = true;
    double ld7 = 402.77038203992174;
    fb0 = ld5 > ld7;
    fd0 = fd1 + ld4;
if(fo0 != null){
      fo0.m3();
}
    double ld8 = 678.5141582404095;
    boolean lb9 = true;
    boolean lb10 = true;

Thought.STACK_COUNTER++;
return lb10;
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought11.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    double ld2 = 78.73842891630082;
    Thought lo3 = Thought95.getInstance(ab1, ab2, ab3, ab4);
    ld2 *= -1;
    fb0 = fd0 > fd1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    ab1 = ld2 < fd0;
    boolean lb4 = true;
    ab1 = fd1 < ld2;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          lb4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld2 < fd0;
    Output.points[4][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb4, ab1, ab2);
}

Thought.STACK_COUNTER++;
return ab3;
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
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 364.70971800488576;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 && lb1;
    fb0 = ad4 < fd0;
    fd1 = ld0 + ad1;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        lb1 = !fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        double ld3 = 714.5358809007048;
}
Thought.STACK_COUNTER++;
return lb1;
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
    ab2 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    double ld0 = 270.2531424341795;
    Thought lo1 = Thought60.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;

Thought.STACK_COUNTER++;
return ab1;
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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought85.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought98.getInstance(fb0, fb1, lb0, lb2);
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = !lb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo4 = Thought85.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
    boolean lb5 = true;
        lb2 = fd0 < fd1;
    boolean lb6 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb5, lb6, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb0;
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
      fb1 = ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    ad3 *= -1;
    Thought lo0 = Thought24.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought51.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    Thought lo3 = Thought32.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb2, fb0);
    boolean lb4 = false;
    Thought lo5 = Thought46.getInstance(ad1, ad2, ad3, ad4);
    boolean lb6 = false;
    lb6 = !fb0;
    fb1 = lb2 && lb4;
    Thought lo7 = Thought25.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
if(ao2 != null){
      ao1 = ao2.m4(lb6, fb0, fb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
        ad3 *= -1;
    lb4 = !lb6;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd1 > fd0;
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    double ld0 = 969.40570529228;
    ld0 = fd0 + fd1;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    ab4 = ld0 < fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && ab1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        Thought lo0 = Thought44.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
        fd1 *= -1;
        ad1 = ad2 + ad3;
        ad4 *= -1;
        double ld1 = 406.75771119353044;
        fb1 = ab1 || ab2;
        ad4 = fd0 + fd1;
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        boolean lb2 = false;
        boolean lb3 = true;
        Output.points[4][1] -= ad4;
        ab1 = !ab2;
        fd0 = fd1 - ld1;
        Thought lo4 = Thought83.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
if(ao2 != null){
          lb2 = ao2.m2(ad1, ad2, ad3, ad4);
}
        Thought lo5 = Thought99.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
        boolean lb6 = true;
        Output.points[4][2] += ad2;
        ad3 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(lb3, lb6, ab1, ab2);
}
        ad4 *= -1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought58.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - fd0;
    double ld2 = 481.1617730256547;
    Thought lo3 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb0, fb0);

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    double ld1 = 638.4134538100477;
    ab2 = ld1 > fd0;
if(fo0 != null){
      fo0.m2();
}
    fd1 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought9.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
    fd1 = ad1 + ad2;
    fb0 = !fb1;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    ad1 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    Output.points[4][3] -= ad2;
    fb0 = ad3 > ad4;
    Output.points[4][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
    ad4 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab4 = fd1 < ad1;
    fb0 = fb1 && ab1;
    Thought lo0 = Thought4.getInstance(ab2, ab3, ab4, fb0);
        fb1 = ad2 > ad3;
    Thought lo1 = Thought4.getInstance();
    ab1 = !ab2;
    boolean lb2 = false;
    ab2 = ad4 > fd0;
    ab3 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab3 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb2, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2();
}
    fb0 = fd1 > fd0;
    Output.points[4][5] -= fd1;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    boolean lb1 = false;
    fd0 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
    boolean lb2 = true;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld3 = 712.1798047527744;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld3, fd0, fd1);
}
if(ao2 != null){
      ld3 = ao2.m3(fb0, fb1, lb0, lb1);
}
    boolean lb4 = false;
    lb2 = fd0 > fd1;
if(ao3 != null){
      lb4 = ao3.m2();
}
    Output.points[4][6] += ld3;
if(ao4 != null){
      ao4.m2(fd0, fd1, ld3, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo5 = Thought66.getInstance(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1, lb2, lb4, fb0, fb1);
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, lb1, lb2, lb4, fb0);
}
    fb1 = ld3 > fd0;
    Thought lo6 = Thought35.getInstance(fd1, ld3, fd0, fd1);
    ld3 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ld3;
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb0 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m3(lb0, fb0, fb1, lb0);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad1 > ad2;
    ad3 *= -1;

Thought.STACK_COUNTER++;
return ad4;
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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought16.getInstance(ao4, fo0, fo1, ao1);
    fb0 = fb1 && ab1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[4][7] -= fd0;
    Output.points[4][8] -= fd1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
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
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
    double ld0 = 565.2677393555474;
    double ld1 = 656.771744784128;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
}
    Thought lo2 = Thought15.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    double ld3 = 893.3180557339967;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      ab3 = ao1.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ld0 = ld1 - ld3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo4 = Thought51.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    boolean lb5 = true;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb5, ab1, ab2);
}
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld3, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 = ld1 + ld3;
    Thought lo7 = Thought4.getInstance(ab2, ab3, ab4, fb0);
    boolean lb8 = true;
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld0, fb1, lb5, lb6, lb8);
}
    ab1 = ab2 || ab3;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    double ld2 = 668.064308296013;
    fb0 = !fb1;
    Output.points[5][0] -= ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
    Output.points[5][1] += ld2;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        Output.points[5][2] += fd1;
        Thought lo0 = Thought75.getInstance(fd0, fd1, fd0, fd1);
        ab2 = !ab3;
        ab4 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        fb1 = fd1 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - fd0;
        double ld1 = 190.46734069336102;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = fb1 || ab1;
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld3 = 432.4327559519728;
        boolean lb4 = false;
        } else if (fb1) {
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        fb1 = ab1 && ab2;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
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
    fb0 = fb1 && fb0;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd1 = ad1 - ad2;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
                lb1 = !fb0;
    boolean lb2 = true;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}

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
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought14.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
        ab3 = ad2 < ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo1 = Thought79.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1);
}
        Thought lo2 = Thought53.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        fb1 = ab1 && ab2;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo0.m3(fb1, ab1, ab2, ab3);
}
        Thought lo3 = Thought79.getInstance();
        Thought lo4 = Thought35.getInstance(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ad4 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        boolean lb5 = true;
        fb0 = fb1 || lb5;
        double ld6 = 162.85993680786214;
        ab1 = ad3 < ad4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    double ld0 = 562.436879310602;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][3] += fd0;
if(ao1 != null){
      ao1.m1(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fb1 = fd1 > ld0;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    ld0 *= -1;
    Output.points[5][4] -= fd0;
    fb0 = !fb1;
    Thought lo2 = Thought36.getInstance();
    lb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    double ld0 = 888.2502354243784;
    Output.points[5][5] -= ld0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld1 = 103.42402708696957;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    fb1 = ld1 < ad1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    boolean lb2 = true;
    boolean lb3 = true;
    if (lb3) {
if(ao1 != null){
          ao1.m2(fb0, fb1, lb2, lb3);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd1 = ld0 - ld1;
if(ao4 != null){
          ao4.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb3);
}
        fd0 = fd1 + ld0;
        Thought lo4 = Thought73.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
}
        Thought lo5 = Thought19.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb3);
        double ld6 = 351.11037853608906;
        fb0 = fb1 && lb2;
        double ld7 = 509.64639336346465;
if(ao1 != null){
          ao1.m1(ad2, ad3, ad4, fd0);
}
        fd1 = ld6 - ld7;
        ld0 *= -1;
        Thought lo8 = Thought11.getInstance(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
        boolean lb9 = true;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought65.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
    double ld3 = 62.04139166259266;
    if (ab4) {
        double ld4 = 617.0812255757974;
if(ao4 != null){
          ao3 = ao4.m4(ld4, ld3, fd0, fd1);
}
        fb0 = ld4 < ld3;
        fd0 = fd1 - ld4;
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought49.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 51.441209077576076;
    Thought lo3 = Thought49.getInstance();
    fb1 = ad4 < fd0;
    fd1 = ld2 - ad1;
    boolean lb4 = true;
    Thought lo5 = Thought78.getInstance(ad2, ad3, ad4, fd0, lb0, lb4, ab1, ab2);
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
    ab4 = !fb0;
    Thought lo6 = Thought13.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb4, ab1, ab2);
}
    fd0 *= -1;

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
    Thought lo0 = Thought22.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 787.7934736521153;
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    ld1 *= -1;
    lb2 = !fb0;
    fd0 = fd1 + ld1;

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
    fb0 = !fb1;
    Thought lo0 = Thought39.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[5][6] -= fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;

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
        fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought33.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
            fd0 *= -1;
    Thought lo1 = Thought29.getInstance(fb1, fb0, fb1, fb0);
    Thought lo2 = Thought29.getInstance();
    Thought lo3 = Thought6.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
    Thought lo4 = Thought86.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    boolean lb5 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    lb5 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
}
