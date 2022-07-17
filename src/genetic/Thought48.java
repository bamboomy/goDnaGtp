package genetic;
import java.util.ArrayList;
class Thought48 extends Thought{
private static ArrayList<Thought48> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 839.6105139835529;
private double fd1 = 99.16677127491221;
private Thought fo0 = null;
private Thought fo1 = null;
Thought48 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought48 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought48 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought48 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought48 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought48 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought48 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought48 instance = new Thought48 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Thought lo1 = Thought363.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Output.points[0][3] += fd0;

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
    double ld0 = 853.9485015130089;
    Thought lo1 = Thought152.getInstance(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought80.getInstance(ab4, fb0, fb1, ab1);
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    ab1 = !ab2;
    Thought lo4 = Thought43.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
    boolean lb0 = true;
    Output.points[0][4] += fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    double ld2 = 974.4835069670823;
    double ld3 = 784.7715733456165;
    boolean lb4 = true;
    lb0 = lb1 || lb4;
    double ld5 = 166.31233312878743;
    ld5 *= -1;
    fb0 = fb1 && lb0;
    double ld6 = 988.1333772741993;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld6, ad1, ad2, ad3);
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
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
    boolean lb0 = false;
    Thought lo1 = Thought97.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
    ad3 = ad4 + fd0;
    ab4 = fd1 > ad1;
    fb0 = ad2 < ad3;
    fb1 = lb0 || ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb0 = fd0 > fd1;
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
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
    double ld0 = 640.4849716847124;
    Thought lo1 = Thought314.getInstance(fb0, fb1, fb0, fb1);
    double ld2 = 705.1525141417272;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Output.points[0][5] -= ld2;
        fb1 = fb0 && fb1;
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld0, ld2, fd0);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ld2, fd0);
}
if(ao1 != null){
          fd1 = ao1.m3(ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = ld0 > ld2;
        boolean lb3 = false;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb3);
}
if(ao1 != null){
          fd1 = ao1.m3();
}
        double ld4 = 675.6808801489051;
        ld4 = ld0 + ld2;
        Thought lo5 = Thought209.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld4, ld0, fb0, fb1, lb3, fb0);
        boolean lb6 = false;
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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    Thought lo0 = Thought92.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought249.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    fb1 = !fb0;

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
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !ab1;
        ab2 = ab3 && ab4;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
        fb0 = fd1 < fd0;
        Output.points[0][6] -= fd1;
        boolean lb0 = false;
        boolean lb1 = true;
        ab4 = fd0 < fd1;
        fd0 = fd1 + fd0;
        }
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;

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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    double ld0 = 211.55275432342907;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 || ab1;
    Output.points[0][7] -= ld0;
if(ao2 != null){
      ad1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    double ld1 = 963.4405028359558;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ld0);
}
    ld1 = ad1 + ad2;
    Thought lo2 = Thought60.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
        Thought lo0 = Thought374.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m2();
}
    fd0 *= -1;
    Output.points[0][8] += fd1;
    Output.points[1][0] -= fd0;
    Thought lo1 = Thought318.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought384.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Output.points[1][1] -= fd0;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought100.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        }
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb3);
}
    fb0 = fd0 < fd1;
    Thought lo5 = Thought13.getInstance(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
    lb3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb3, fb0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought104.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        boolean lb3 = false;
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        lb0 = lb2 || ab1;
        Output.points[1][2] -= fd0;
        fd1 = fd0 + fd1;
        boolean lb4 = false;
        double ld5 = 575.0941195642998;
        ld5 = fd0 - fd1;
if(fo1 != null){
          ab1 = fo1.m2(ld5, fd0, fd1, ld5, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + ld5;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb3, lb4, lb0, lb2);
}
        boolean lb6 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld7 = 185.83479615875603;
        boolean lb8 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, ld7, fd0, fd1, lb0, lb2, ab1, ab2);
}
        ab3 = ld5 < ld7;
}
Thought.STACK_COUNTER++;
return lb2;
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
    fb0 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
        fb1 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        if (fb1) {
            double ld0 = 743.2048096719685;
if(fo1 != null){
              fb0 = fo1.m2();
}
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
              fo1.m1(fb1, fb0, fb1, fb0);
}
}}
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, lb0, lb1, ab1, ab2);
}
    boolean lb2 = true;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
      lb0 = fo1.m2();
}
    lb1 = lb2 && ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    Output.points[1][3] -= ad4;
    lb2 = fd0 < fd1;

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
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    double ld2 = 77.62286587594815;
    lb0 = ld2 > fd0;
    lb1 = fb0 || fb1;
    Output.points[1][4] += fd1;
    lb0 = ld2 < fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought137.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fb0 = !fb1;
    Thought lo1 = Thought250.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    ad3 *= -1;
    Thought lo3 = Thought200.getInstance(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
if(fo0 != null){
      ao4 = fo0.m4();
}
    ad4 *= -1;
    fb0 = fd0 > fd1;
    Output.points[1][5] -= ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
    fd1 = ad1 - ad2;
    double ld4 = 793.3339927649943;

Thought.STACK_COUNTER++;
return lb2;
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
    Thought lo0 = Thought345.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = ab1 || ab2;
    Output.points[1][6] -= fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab3 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought241.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    boolean lb2 = false;
    ab4 = fb0 || fb1;

Thought.STACK_COUNTER++;
return lb2;
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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb0 = true;
if(ao3 != null){
      fd1 = ao3.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    lb0 = ad2 < ad3;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    double ld0 = 771.8896995781623;
    ld0 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    Output.points[1][7] -= fd1;
    fb1 = ld0 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && ab1;
    double ld0 = 686.3281192948922;
    ab2 = !ab3;
    boolean lb1 = true;
    boolean lb2 = false;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Output.points[1][8] += fd1;
    ab2 = !ab3;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    lb2 = fd1 > ld0;
    fd0 = fd1 + ld0;
    ab1 = fd0 < fd1;

Thought.STACK_COUNTER++;
return ld0;
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
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 290.7475723072957;
    Thought lo1 = Thought119.getInstance();
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = ld0 > ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    Output.points[2][0] -= ad1;
    Thought lo2 = Thought102.getInstance(fb0, fb1, fb0, fb1);
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[2][1] += fd0;
    fb1 = fd1 < ld0;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3();
}
    fb0 = ad4 < fd0;
    double ld3 = 958.0770873671216;

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
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab2 = fd1 > ad1;
    ab3 = ad2 > ad3;
    ab4 = ad4 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    lb0 = ad3 > ad4;
    ab1 = ab2 && ab3;
    double ld1 = 484.6734911752694;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ab4 = !fb0;
    Output.points[2][2] -= ad4;
    Thought lo2 = Thought349.getInstance(fd0, fd1, ld1, ad1, fb1, lb0, ab1, ab2);
    ab3 = ad2 > ad3;
    ab4 = ad4 < fd0;
    boolean lb3 = true;

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
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    if (fb0) {
        Thought lo0 = Thought286.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
        double ld1 = 682.6469404100602;
        double ld2 = 546.6493480540778;
        Thought lo3 = Thought260.getInstance();
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld1, fb0, fb1, lb4, fb0);
}
        fb1 = lb4 || fb0;
        Thought lo5 = Thought178.getInstance(fb1, lb4, fb0, fb1);
        boolean lb6 = false;
        boolean lb7 = false;
        ld2 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        lb4 = !lb6;
        double ld8 = 304.7612364452483;
if(fo0 != null){
          ld8 = fo0.m3(fd0, fd1, ld1, ld2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[2][3] -= fd1;
    fb0 = ad1 < ad2;
    fb1 = !fb0;
    fb1 = !fb0;
    ad3 = ad4 + fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
if(ao2 != null){
          ao2.m1(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought288.getInstance();
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        }
    Thought lo1 = Thought397.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Thought lo2 = Thought341.getInstance(ao3, ao4, fo0, fo1);
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb3 = false;
    fd1 = ad1 - ad2;
    boolean lb4 = false;

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
        ab1 = ab2 || ab3;
    boolean lb0 = false;
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld1 = 221.30860635819866;
    lb0 = ab1 || ab2;
    ab3 = ab4 && fb0;
    if (fb1) {
        double ld2 = 549.5948170627404;
        lb0 = ld2 > ld1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld2, ld1);
}
        fd0 = fd1 - ld2;
        } else {
        fd0 = fd1 + ld1;
        boolean lb3 = true;
        boolean lb4 = true;
        boolean lb5 = true;
if(ao3 != null){
          lb4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
if(ao2 != null){
          fd1 = ao2.m3(ld1, fd0, fd1, ld1, lb5, lb0, ab1, ab2);
}
        fd0 = fd1 - ld1;
        fd0 = fd1 - ld1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        Output.points[2][4] += fd0;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, lb3, lb4, lb5, lb0);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = fb0 && fb1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao4.m1(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao4.m3();
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    ab2 = fd1 < ad1;
    Thought lo1 = Thought368.getInstance(ab3, ab4, fb0, fb1);
    Output.points[2][5] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      lb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought257.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    Output.points[2][6] -= ad3;
    fb0 = fb1 && lb0;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought142.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo1 = Thought62.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        } else if (fb1) {
        double ld2 = 173.43515977979519;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld3 = 677.9486751292844;
        fb1 = !fb0;
        boolean lb4 = true;
if(fo1 != null){
          fb0 = fo1.m2(ld3, fd0, fd1, ld2);
}
        double ld5 = 178.8025404536354;
        Output.points[2][7] += ld3;
        boolean lb6 = true;
        if (fb0) {
            Thought lo7 = Thought185.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld2);
if(fo0 != null){
              fo0.m3(ld3, ld5, fd0, fd1, fb1, lb4, lb6, fb0);
}
if(fo1 != null){
              ld2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb4, lb6, fb0);
}
            fb1 = lb4 || lb6;
            } else {
if(fo0 != null){
              fb0 = fo0.m2();
}
            Output.points[2][8] -= ld3;
            ld5 = fd0 - fd1;
}}
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
    ab2 = fd0 > fd1;
    boolean lb0 = true;
    fd0 *= -1;
    Thought lo1 = Thought39.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m2(fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 && ab1;
    Thought lo2 = Thought37.getInstance(fd1, fd0, fd1, fd0);
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        if (ab1) {
            ab2 = fd1 < fd0;
            boolean lb4 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
            fd1 = fd0 + fd1;
}}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought361.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    double ld1 = 753.2352528225058;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[3][0] += fd1;
    ld1 = ad1 - ad2;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld0 = 464.2215631064707;
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb1 = true;
    lb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, ab1);
}
    if (ab2) {
        ld0 *= -1;
        double ld2 = 560.8464844895803;
        boolean lb3 = true;
        Thought lo4 = Thought163.getInstance(fo1, fo0, fo1, fo0);
        ab2 = ab3 && ab4;
        boolean lb5 = true;
        if (ab4) {
            Thought lo6 = Thought111.getInstance(ld0, ad1, ad2, ad3);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
}
            Thought lo7 = Thought185.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, lb3, lb5);
            double ld8 = 148.2526821848854;
            Thought lo9 = Thought92.getInstance(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
            ad3 *= -1;
}}
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
        fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    if (fb0) {
        fd0 *= -1;
        double ld0 = 588.2675221783082;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ld0;
        Thought lo1 = Thought58.getInstance(fb0, fb1, fb0, fb1);
        Thought lo2 = Thought133.getInstance(ao3, ao4, fo0, fo1);
        Output.points[3][1] += fd0;
        Thought lo3 = Thought55.getInstance(fd1, ld0, fd0, fd1);
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
        Thought lo4 = Thought221.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
if(ao1 != null){
          fo1 = ao1.m4();
}
        ld0 *= -1;
        fd0 = fd1 + ld0;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
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
    Output.points[3][2] -= ad1;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    double ld0 = 966.1496606079046;
    boolean lb1 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(lb0, ab1, ab2, ab3);
}
    Output.points[3][3] += fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab4 = fd1 < fd0;
    fb0 = fb1 || lb0;
    ab1 = fd1 > fd0;
if(ao2 != null){
      ab2 = ao2.m2(fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
    boolean lb1 = false;
    ab3 = !ab4;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][4] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = ad3 < ad4;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    fb0 = fb1 || lb0;
    Output.points[3][5] += ad2;
    ad3 = ad4 - fd0;
    double ld1 = 632.0193562143327;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ld1 - ad1;
    ab2 = ab3 && ab4;
    fb0 = ad2 > ad3;
    Output.points[3][6] += ad4;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1);
}
if(fo0 != null){
          ab2 = fo0.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        fd1 *= -1;
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought33.getInstance();
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought10.getInstance(lb1, fb0, fb1, lb1);
    double ld3 = 90.85170852956226;
    fb0 = fb1 || lb1;
    boolean lb4 = false;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb5 = false;
    lb5 = fd0 < fd1;
    fb0 = ld3 < fd0;
    Output.points[3][7] -= fd1;
    fb1 = ld3 < fd0;
    fd1 = ld3 - fd0;
    lb1 = lb4 || lb5;
if(fo0 != null){
      fd1 = fo0.m3(ld3, fd0, fd1, ld3);
}
    fb0 = fb1 || lb1;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1, lb5, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb4, lb5, fb0, fb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought307.getInstance();
    fd0 = fd1 - fd0;
    double ld1 = 621.1894636486652;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fd1 = ld1 - fd0;
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = true;
    fb0 = !fb1;
    boolean lb1 = true;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    lb1 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo1.m1(fb1, lb0, lb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought309.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    Output.points[3][8] -= fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    Thought lo3 = Thought339.getInstance();
    lb0 = lb1 || fb0;

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
