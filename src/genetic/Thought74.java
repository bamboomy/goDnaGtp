package genetic;
import java.util.ArrayList;
class Thought74 extends Thought{
private static ArrayList<Thought74> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 621.7178683188455;
private double fd1 = 773.434300903666;
private Thought fo0 = null;
private Thought fo1 = null;
Thought74 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought74 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought74 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought74 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought74 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought74 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought74 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought74 instance = new Thought74 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought22.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = fd0 > fd1;
    lb0 = fd0 > fd1;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought20.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
    lb0 = lb2 && lb3;
    Thought lo5 = Thought43.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
if(fo1 != null){
      lb3 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    Thought lo6 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3(lb2, lb3, fb0, fb1);
}
    Thought lo7 = Thought57.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb2, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;

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
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld0 = 702.7929190650897;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    ab1 = fd1 < ld0;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
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
    double ld0 = 97.53092061254696;
    ld0 = ad1 - ad2;
    Thought lo1 = Thought52.getInstance(fb1, fb0, fb1, fb0);
    Output.points[7][7] -= ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    Output.points[7][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    fb1 = !fb0;
    Thought lo2 = Thought69.getInstance(fo1, fo0, fo1, fo0);
    Output.points[8][0] -= fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        ad1 *= -1;
        }
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    lb0 = !ab1;
        Thought lo1 = Thought94.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
        boolean lb2 = false;
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
    double ld3 = 780.1849024492044;
if(fo1 != null){
      fo1.m2();
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld3, fb1, lb0, lb2, ab1);
}
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad1 *= -1;
        Output.points[8][1] += ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
}
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    fd0 *= -1;
if(ao4 != null){
          ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    lb1 = lb2 && lb3;
    fd1 *= -1;

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
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    fb1 = !lb0;
    Thought lo1 = Thought5.getInstance(fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo2 = Thought14.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[8][2] += ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought53.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    lb0 = lb4 || fb0;
    boolean lb5 = false;
    fb0 = fb1 && lb0;

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
    boolean lb0 = false;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought82.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    Output.points[8][3] += fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
    Thought lo2 = Thought23.getInstance(ao4, fo0, fo1, ao1);
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    Thought lo3 = Thought89.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    boolean lb4 = false;

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
      ao1.m2();
}
if(ao2 != null){
      ab2 = ao2.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    ab3 = ad2 < ad3;
    double ld0 = 989.2364909520809;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
    double ld1 = 854.1279775123696;
    Thought lo2 = Thought58.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    ab1 = fd0 > fd1;
    boolean lb3 = true;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Output.points[8][4] -= ld0;
    lb3 = ld1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[8][5] += ad2;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 965.8416512324131;
    fb1 = !fb0;
        Output.points[8][6] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld1 = 68.62558111233096;
    boolean lb2 = true;
    fb0 = !fb1;
if(fo0 != null){
      lb2 = fo0.m2(ld0, ld1, fd0, fd1);
}
    ld0 = ld1 - fd0;
    fd1 = ld0 + ld1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought62.getInstance();
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb2 = fo0.m2(fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 || fb0;
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
    Output.points[8][7] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    lb0 = !ab1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = fd1 > fd0;
    Output.points[8][8] -= fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
        fd0 *= -1;
        double ld3 = 166.22908969970322;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
        ld3 *= -1;
        fb0 = !fb1;
        lb0 = lb1 && lb2;
if(fo0 != null){
          fo0.m1(ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = fd1 < ld3;
        fd0 *= -1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    double ld0 = 129.1618732720184;
    Output.points[0][0] -= ad3;
    fb0 = fb1 || fb0;
    double ld1 = 265.14736782203323;
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad3 > ad4;
    Thought lo2 = Thought97.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        ad1 *= -1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1);
}
    boolean lb3 = true;
        Output.points[0][1] += ad2;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m3();
}
    fb0 = ad3 > ad4;

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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ad4 > fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Output.points[0][2] += fd1;
    Output.points[0][3] -= ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = ad2 < ad3;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ab1 = !ab2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
        fb1 = fd1 < fd0;
    double ld0 = 355.41260311500525;
    fb0 = fd0 < fd1;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought18.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fb1 = fb0 && fb1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought70.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
        fb1 = fb0 || fb1;
    fb0 = fd1 < ad1;
    double ld1 = 335.01701535176414;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld1;
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    Output.points[0][4] += ad4;
        fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
    double ld0 = 667.9369733011779;
    if (ab2) {
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought81.getInstance(fd1, ld0, fd0, fd1);
        ld0 = fd0 + fd1;
        ld0 = fd0 - fd1;
        fb1 = ld0 < fd0;
        Output.points[0][5] += fd1;
        ld0 = fd0 + fd1;
        boolean lb2 = true;
        lb2 = ab1 || ab2;
if(ao1 != null){
          ab3 = ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
        Output.points[0][6] += fd0;
if(fo1 != null){
          fo1.m1(ab4, fb0, fb1, lb2);
}
        ab1 = fd1 > ld0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 445.41064965162144;
    boolean lb1 = true;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3();
}
    boolean lb2 = true;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ad1, ad2, lb2, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
    Thought lo3 = Thought31.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
    lb2 = ab1 && ab2;
    ad4 = fd0 + fd1;
    Output.points[0][7] += ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought86.getInstance(ad1, ad2, ad3, ad4);
    boolean lb5 = true;
        lb1 = lb2 || lb5;
    ab1 = fd0 > fd1;
        boolean lb6 = false;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb2);
}
    lb5 = ad4 > fd0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought80.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld1 = 916.9683631025542;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought52.getInstance();
    ld1 = fd0 + fd1;
    Thought lo3 = Thought28.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
        fd0 = fd1 + ld1;
    fb0 = fd0 < fd1;
    Thought lo4 = Thought9.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    Thought lo5 = Thought52.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);

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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    double ld0 = 259.38129805025596;
    boolean lb1 = false;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb1);
}
    ab1 = fd1 > ld0;
    boolean lb2 = false;
    ab1 = !ab2;
    boolean lb3 = true;
    fd0 *= -1;
    fd1 = ld0 - fd0;
if(fo1 != null){
      ab2 = fo1.m2();
}
    if (ab3) {
        double ld4 = 285.30210681133696;
        ab4 = fb0 && fb1;
        boolean lb5 = false;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Output.points[0][8] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    Thought lo0 = Thought29.getInstance(fd0, fd1, ad1, ad2);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad1;
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
        ad2 *= -1;
    ad3 = ad4 - fd0;
    ab1 = fd1 > ad1;
    ab2 = ad2 > ad3;
    ab3 = ad4 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1();
}
    boolean lb1 = false;
    boolean lb2 = false;
        double ld3 = 98.65363400492102;
    double ld4 = 16.63529070650301;
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return ld4;
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
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    fb0 = !fb1;
    Output.points[1][0] += fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought9.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    fb1 = fb0 || fb1;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 969.3791010066682;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    double ld1 = 576.6037946979202;
    Thought lo2 = Thought70.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought16.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(ld0, ld1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought49.getInstance(fb0, fb1, fb0, fb1);
    ld0 = ld1 - ad1;
    fb0 = ad2 < ad3;
if(ao4 != null){
      ad4 = ao4.m3();
}
    boolean lb5 = false;

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
    Thought lo0 = Thought70.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        lb1 = lb2 && lb3;
        boolean lb4 = false;
        double ld5 = 903.8377443531582;
        Thought lo6 = Thought67.getInstance(fo1, ao1, ao2, ao3, lb3, ab1, ab2, ab3);
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld5, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab2 = ad3 < ad4;
    Output.points[1][1] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
        ab1 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
          ao4 = fo0.m4();
}
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought6.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ad2 *= -1;
    ab4 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ab4 = ad3 > ad4;
    boolean lb1 = true;
    fd0 = fd1 - ad1;

Thought.STACK_COUNTER++;
return ad2;
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
    double ld0 = 9.819945865039976;
    fb0 = fb1 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld1 = 19.457430886291935;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
          fb0 = fo1.m2(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    Thought lo3 = Thought40.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
    ld0 *= -1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
        boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0, lb4, lb5, fb0, fb1);
}
    boolean lb6 = false;
    Thought lo7 = Thought29.getInstance(fo0, fo1, fo0, fo1);
    ld1 = fd0 + fd1;
    ld0 = ld1 - fd0;

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
    ab1 = fd1 < fd0;
    boolean lb0 = true;
    Output.points[1][2] += fd1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ab1 = !ab2;
    double ld1 = 686.2460867572161;
    ab3 = !ab4;
    fd0 = fd1 + ld1;
    Thought lo2 = Thought9.getInstance(fd0, fd1, ld1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ld1;

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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ad2 = ad3 - ad4;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    boolean lb0 = true;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    Output.points[1][3] += ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought65.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    double ld2 = 544.4481830076301;
if(fo0 != null){
      fo0.m3(ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - ld2;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo1 != null){
      ad1 = fo1.m3();
}
    fb1 = ad2 < ad3;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
    Output.points[1][4] -= ad1;

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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[1][5] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 117.94393530827584;
if(ao4 != null){
      lb0 = ao4.m2(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 633.5573202787863;
    boolean lb1 = true;
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    lb1 = ad3 < ad4;
    fb0 = fb1 || lb1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2();
}
    fd0 = fd1 - ld0;
    ad1 = ad2 - ad3;
    boolean lb2 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m2();
}
    double ld1 = 460.60198839343883;
if(ao3 != null){
      ao3.m3(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ld1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        boolean lb4 = true;
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
    Thought lo0 = Thought64.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought54.getInstance(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
        double ld2 = 358.9329416505979;
    ad4 = fd0 + fd1;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    if (ab4) {
        ld2 = ad1 + ad2;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo0.m2(fb0, fb1, ab1, ab2);
}
        double ld3 = 185.72204732361266;
        ld3 = ld2 - ad1;
if(ao1 != null){
          fo1 = ao1.m4();
}
        ab3 = ab4 || fb0;
        boolean lb4 = true;
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
    double ld0 = 690.9844712870183;
    fb1 = fd0 < fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
    double ld1 = 23.412089612841946;
    fb0 = fb1 && fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
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
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2();
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Output.points[1][6] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought11.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
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
}
