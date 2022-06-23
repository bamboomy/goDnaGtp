package genetic;
import java.util.ArrayList;
class Thought16 extends Thought{
private static ArrayList<Thought16> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 285.79917218925345;
private double fd1 = 970.3097253433072;
private Thought fo0 = null;
private Thought fo1 = null;
Thought16 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought16 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought16 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    Thought lo0 = Thought40.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
    Thought lo1 = Thought74.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab2 = !ab3;
    fd1 *= -1;
    ab4 = fb0 || fb1;
    lb0 = !ab1;
    fd0 = fd1 - fd0;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    double ld1 = 587.8059210359615;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
    ad1 *= -1;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
    Thought lo2 = Thought46.getInstance(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = lb1 || fb0;
        boolean lb3 = true;
    fb0 = fb1 || lb0;
if(fo1 != null){
      lb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb0);
}
    Thought lo4 = Thought74.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    Thought lo5 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, lb3, fb0, fb1);
    ad4 *= -1;
    Output.points[8][0] += fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, lb3, fb0);
}
    Thought lo6 = Thought98.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb0, lb1, lb3, fb0);
}
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ad2 < ad3;
    Thought lo0 = Thought63.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ab4 = fb0 || fb1;
        boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    lb1 = ab1 || ab2;

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
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought13.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld1 = 134.66643961166892;
    boolean lb2 = false;
    Thought lo3 = Thought29.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    lb2 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2();
}
    Output.points[8][1] -= fd1;
    boolean lb4 = false;
    Output.points[8][2] -= ld1;
    fd0 *= -1;
    boolean lb5 = true;
if(ao1 != null){
          fd1 = ao1.m3(ld1, fd0, fd1, ld1);
}
    double ld6 = 960.0905836503814;
    lb4 = lb5 || fb0;
    fb1 = ld6 > fd0;
    fd1 = ld1 - ld6;
    Thought lo7 = Thought92.getInstance(lb2, lb4, lb5, fb0);
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld6, fd0, fd1, ld1);
}
    fb1 = lb2 && lb4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld6, fd0, fd1, ld1, lb5, fb0, fb1, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb4, lb5, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    ld6 = fd0 - fd1;

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
      ao1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    boolean lb1 = true;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    double ld2 = 625.400425510051;
    Thought lo3 = Thought23.getInstance(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
    Output.points[8][3] -= ld2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb1 = fo0.m2();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    double ld0 = 150.66965212619817;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought27.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    Thought lo2 = Thought5.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
    boolean lb3 = false;
    double ld4 = 663.8204710709446;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld0, ab4, fb0, fb1, lb3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ld4 > fd0;
    fb1 = !lb3;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, ld4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - ld4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      ao4 = fo0.m4(ld4, fd0, fd1, ld0);
}
if(fo1 != null){
      ld4 = fo1.m3(fb1, lb3, ab1, ab2);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, ld4, fd0);
}
    Thought lo5 = Thought67.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, ld4, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, ab1, ab2, ab3);
}
    Output.points[8][4] += fd1;
    ab4 = ld0 > ld4;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought6.getInstance(ao1, ao2, ao3, ao4);
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
    Thought lo2 = Thought58.getInstance();
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || lb1;
if(ao1 != null){
      ao1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    double ld3 = 497.9234820933701;
    ad1 *= -1;
    ad2 *= -1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[8][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 711.1052536122131;
    fb0 = ld0 < fd0;
    fd1 = ld0 - fd0;
    double ld1 = 682.0033093154838;
    if (fb1) {
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        fb0 = fd0 < fd1;
if(fo0 != null){
          ld0 = fo0.m3();
}
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld0);
}
        ld1 = fd0 - fd1;
if(fo1 != null){
          ld0 = fo1.m3(fb1, fb0, fb1, fb0);
}
        double ld2 = 126.06554989015665;
        ld0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld2);
}
        fb1 = ld0 < ld1;
        fb0 = fb1 && fb0;
        fd0 = fd1 - ld2;
        fb1 = !fb0;
        fb1 = fb0 && fb1;
        boolean lb3 = true;
        lb3 = fb0 || fb1;
        ld0 *= -1;
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld2, fb0, fb1, lb3, fb0);
}
}
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
    ab2 = !ab3;
    double ld0 = 808.6837022579081;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought92.getInstance();
    fd1 = ld0 + fd0;
    ab1 = ab2 && ab3;
    fd1 = ld0 + fd0;
    ab4 = fd1 < ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    fb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought33.getInstance();
    ad2 = ad3 + ad4;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
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
        ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    ab4 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[8][6] += fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought21.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    fb0 = fd1 < fd0;
    fb1 = lb1 || fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb2 = true;

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
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
if(ao2 != null){
          ao2.m2();
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}

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
    boolean lb0 = true;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m2(lb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld3 = 423.6763295410338;
    boolean lb4 = true;
    ld3 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        ld3 = fd0 - fd1;
        ab2 = !ab3;
        ld3 = fd0 - fd1;
        ld3 *= -1;
        fd0 = fd1 - ld3;
        Output.points[8][7] += fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld3, fd0, fd1, ab4, fb0, fb1, lb0);
}
        lb1 = lb2 || lb4;
        ab1 = ab2 || ab3;
        ab4 = ld3 < fd0;
        fd1 = ld3 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
        fd1 = ld3 + fd0;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        double ld5 = 36.08001553288954;
        lb2 = !lb4;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought77.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought75.getInstance();
    fb1 = fd0 > fd1;
    boolean lb2 = false;
    double ld3 = 521.5569440987073;
    lb2 = ld3 < ad1;
    Thought lo4 = Thought64.getInstance(ad2, ad3, ad4, fd0);
    double ld5 = 454.820503469125;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld3, ld5);
}
    ad1 = ad2 - ad3;
    double ld6 = 664.5190159688023;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb2, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ld3 = ld5 - ld6;
    lb2 = !ab1;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = !lb2;
    double ld7 = 95.95103280851913;
    ab1 = ad4 > fd0;
    double ld8 = 402.93439727969525;
    double ld9 = 477.2307742193022;
    ab2 = ab3 || ab4;
    Thought lo10 = Thought38.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld3);
}

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = !lb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
        double ld3 = 335.2100949020601;
    fd0 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, lb4, fb0, fb1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 || fb0;
    Thought lo0 = Thought47.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m1();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      ab4 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought46.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    double ld2 = 202.55413138880223;
    ld2 *= -1;
    Thought lo3 = Thought56.getInstance();
    Thought lo4 = Thought31.getInstance(fd0, fd1, ld2, fd0);

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    double ld1 = 824.7749612992145;
    ld1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought43.getInstance(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld1, ad1);
}
    boolean lb3 = true;
    lb3 = ad2 < ad3;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb0);
}
    double ld5 = 980.9852940261651;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, ld5, ad1, ad2, lb4, fb0, fb1, lb0);
}
    Output.points[8][8] += ad3;
    for(int i0=0; i0<10; i0++){
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld0 = 435.53253673324076;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 86.15088090080755;
    Output.points[0][0] -= ad2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ld0 *= -1;
        ld1 = ad1 - ad2;
        boolean lb2 = false;
        ab3 = ad3 > ad4;
        Thought lo3 = Thought28.getInstance();
        fd0 = fd1 + ld0;
        }
    fb0 = !fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Output.points[0][1] += fd1;
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
        fb1 = !fb0;
    fd0 *= -1;
    Output.points[0][2] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;

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
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 386.84963617437126;
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[0][3] -= ld0;
        Thought lo1 = Thought89.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        double ld2 = 588.8714690243178;
        fd0 *= -1;
        fb1 = fd1 > ld2;
        Output.points[0][4] += ld0;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        }
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld0;
    boolean lb3 = false;
    Thought lo4 = Thought25.getInstance(fo0, fo1, ao1, ao2);
    fb0 = fb1 || lb3;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb3, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought36.getInstance(ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Thought lo2 = Thought59.getInstance(ao3, ao4, fo0, fo1);
    fd0 *= -1;
    fd1 *= -1;
    fb1 = lb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = !lb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    double ld0 = 559.0618079068773;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ab4 = ao3.m2(ld0, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 > fd0;
if(ao4 != null){
          fd1 = ao4.m3(fb1, lb1, ab1, ab2);
}
        Thought lo2 = Thought98.getInstance(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
        ad4 = fd0 - fd1;
        ld0 = ad1 - ad2;
        double ld3 = 364.5607240338455;
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought72.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb3 = fd0 < fd1;
    boolean lb4 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
    lb4 = fb0 && fb1;

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
    double ld0 = 606.3382157432918;
    double ld1 = 924.2371776258872;
    boolean lb2 = true;
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
    lb2 = ab1 || ab2;
    ld0 = ld1 - fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    ld0 = ld1 - fd0;
    fd1 = ld0 + ld1;
    fb1 = lb2 || ab1;
    ab2 = ab3 && ab4;
    Output.points[0][5] -= fd0;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld0;

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
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought95.getInstance(fo1, fo0, fo1, fo0);
    ad4 = fd0 - fd1;
    lb0 = ad1 > ad2;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought28.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = !lb0;
    double ld3 = 933.2732497339017;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
    boolean lb5 = false;
    lb5 = fb0 && fb1;
    lb0 = lb4 && lb5;

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
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    lb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    Thought lo2 = Thought39.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, lb1, ab1);
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought74.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, lb0, lb1, ab1, ab2);
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
    fd0 = fd1 - fd0;
    Output.points[0][6] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 > fd0;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        fb1 = fb0 && fb1;
        Thought lo0 = Thought53.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
        fd0 = fd1 + fd0;
        Thought lo1 = Thought4.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
        fb1 = !fb0;
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
    fb1 = fb0 || fb1;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    Thought lo0 = Thought37.getInstance();
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
    Thought lo1 = Thought14.getInstance(fd1, ad1, ad2, ad3);
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    double ld2 = 387.64633998381373;
    fd0 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, ad1, ad2);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}

Thought.STACK_COUNTER++;
return ao2;
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
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab1 = ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
if(ao2 != null){
          fd0 = ao2.m3();
}
if(ao3 != null){
          ao3.m2(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(ao4 != null){
          fb1 = ao4.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        Thought lo0 = Thought78.getInstance(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
        fd1 = fd0 + fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = ad1 < ad2;
    double ld0 = 208.1391266286137;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    if (ab1) {
if(ao4 != null){
          ao4.m1();
}
        Thought lo1 = Thought68.getInstance(fd1, ld0, ad1, ad2);
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = !ab1;
        Thought lo2 = Thought25.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
        ab2 = ld0 < ad1;
        double ld3 = 361.9792101665497;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
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
    Output.points[0][7] += fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    Output.points[0][8] += fd1;
    boolean lb1 = false;
    Thought lo2 = Thought38.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fd0 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought40.getInstance();
    fb0 = !fb1;
    lb0 = fd1 > fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0);
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
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
        fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld1 = 57.222553268884674;
    ld1 = fd0 - fd1;
    ld1 *= -1;
    fd0 = fd1 + ld1;
    fb0 = fd0 > fd1;
    fb1 = !lb0;

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
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought87.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo3 = Thought5.getInstance();
    boolean lb4 = false;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = !lb2;
    fd0 = fd1 - fd0;

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
