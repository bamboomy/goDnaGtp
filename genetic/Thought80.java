package genetic;
import java.util.ArrayList;
class Thought80 extends Thought{
private static ArrayList<Thought80> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 867.2724762527433;
private double fd1 = 48.91715368083274;
private Thought fo0 = null;
private Thought fo1 = null;
Thought80 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought80 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought80 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought80 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought80 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought80 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought80 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought80 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought80 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought80 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought80 instance = new Thought80 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought91.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought38.getInstance(fo1, fo0, fo1, fo0);
        fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo2 = Thought64.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb3;
    double ld4 = 78.02761149882069;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(lb3, fb0, fb1, lb3);
}
    Thought lo5 = Thought2.getInstance();
    fb0 = ld4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld4, fd0, fd1, fb1, lb3, fb0, fb1);
}
        ld4 = fd0 - fd1;
    boolean lb6 = true;
    Thought lo7 = Thought95.getInstance(fo0, fo1, fo0, fo1);
    ld4 = fd0 - fd1;
    lb3 = ld4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, lb6, fb0, fb1, lb3);
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
    fd1 *= -1;
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    boolean lb0 = true;
        ab3 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb2 = ab1 || ab2;
    Output.points[8][7] -= fd0;
    boolean lb3 = false;
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      lb2 = fo1.m2();
}
    lb3 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 > fd1;
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    Output.points[8][8] -= fd0;
    double ld0 = 378.4199840555811;
    for(int i0=0; i0<10; i0++){
        double ld1 = 172.90073350584606;
        fb1 = !fb0;
        ad4 *= -1;
        Thought lo2 = Thought97.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
          fd0 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, ld0, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        fb0 = fb1 && fb0;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        double ld3 = 381.3007917132684;
        Thought lo4 = Thought1.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        boolean lb5 = true;
        boolean lb6 = true;
        Output.points[0][0] -= fd0;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    fb1 = ad4 > fd0;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = ab1 || ab2;
    Output.points[0][1] -= ad1;
    Thought lo2 = Thought90.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ad2 = ad3 - ad4;
    lb0 = fd0 > fd1;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought76.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought77.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Output.points[0][2] += fd0;
    double ld2 = 497.14207894596126;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought6.getInstance(fd0, fd1, ld2, fd0, fb1, fb0, fb1, fb0);
    fd1 = ld2 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = fd1 < ld2;
    fb0 = fb1 || fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[0][3] -= fd1;
    fb1 = fb0 && fb1;

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
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    fb0 = ad3 > ad4;
    Output.points[0][4] -= fd0;
    double ld0 = 477.63566311545713;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[0][5] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ad1, ad2, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo2 = Thought49.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    fb0 = ad1 > ad2;
    boolean lb3 = true;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb3);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0);
}
    lb1 = lb3 && fb0;
    fb1 = lb1 && lb3;
    Output.points[0][6] += ad1;
    fb0 = fb1 || lb1;
    lb3 = ad2 < ad3;
    boolean lb4 = true;
    lb4 = ad4 < fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2);
}
    fb0 = fb1 && lb1;

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
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    ab4 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        boolean lb1 = true;
        fd0 = fd1 + fd0;
        double ld2 = 538.9244697090877;
        boolean lb3 = false;
if(ao1 != null){
          ao1.m2(lb1, lb3, lb0, ab1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 *= -1;
    ad3 *= -1;
    Output.points[0][7] += ad4;
    ab1 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 || ab4;
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought37.getInstance(fb0, fb1, ab1, ab2);
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = ab4 || fb0;
    boolean lb1 = false;
    fd1 *= -1;
    fb0 = ad1 < ad2;
    Thought lo2 = Thought42.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
    ab3 = ad1 < ad2;
    ab4 = fb0 && fb1;
    Output.points[0][8] -= ad3;
    double ld3 = 465.1734669526029;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought0.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    double ld1 = 878.3653830329081;
    fb0 = ld1 > fd0;
    fd1 = ld1 + fd0;
    fb1 = fb0 && fb1;
    double ld2 = 318.73965368288475;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
    ab1 = !ab2;
    if (ab3) {
        ab4 = fd1 < fd0;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo0.m1(fd1, fd0, fd1, fd0);
}
            Output.points[1][0] += fd1;
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
            fd0 = fd1 + fd0;
            }
        Output.points[1][1] -= fd1;
        fb1 = fd0 > fd1;
        boolean lb0 = false;
        lb0 = ab1 && ab2;
}
Thought.STACK_COUNTER++;
return ab4;
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
        boolean lb0 = true;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
        fb0 = fb1 || lb1;
        lb0 = fb0 || fb1;
        boolean lb2 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[1][2] -= fd0;
    double ld0 = 248.39375993008764;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1();
}
    ab4 = !fb0;
    double ld1 = 424.2840721098824;
    fb1 = ab1 || ab2;
    ab3 = ad4 < fd0;
    fd1 = ld0 + ld1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    double ld2 = 375.07469764587205;
    ad4 *= -1;
    ab4 = fd0 > fd1;
    boolean lb3 = true;
    ld0 = ld1 + ld2;
    ab4 = !fb0;
    Thought lo4 = Thought87.getInstance(ad1, ad2, ad3, ad4, fb1, lb3, ab1, ab2);
    Thought lo5 = Thought36.getInstance(fo0, fo1, fo0, fo1);

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought34.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    if (fb0) {
        fd1 *= -1;
        fd0 = fd1 - fd0;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
        lb1 = fb0 && fb1;
        lb1 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
        fb1 = !lb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fb0 = fb1 && lb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] -= ad1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Output.points[1][4] -= ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    Output.points[1][5] += ad4;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m2(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[1][6] += ad3;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld0 = 312.13289352272386;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2();
}
        ab3 = fd0 > fd1;
        ab4 = fb0 && fb1;
        Output.points[1][7] -= ld0;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
        double ld1 = 850.0449340984031;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
        fb0 = fb1 && ab1;
        ab2 = fd1 < ld1;
        boolean lb2 = true;
        ab2 = ld0 > fd0;
        fd1 = ld1 + ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld0, ab3, ab4, fb0, fb1);
}
        lb2 = ab1 || ab2;
}
Thought.STACK_COUNTER++;
return ab4;
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
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld1 = 560.8355158427458;
    Thought lo2 = Thought15.getInstance(ld1, ad1, ad2, ad3);
    lb0 = ab1 || ab2;
    ab3 = ad4 > fd0;
    boolean lb3 = true;
    ab3 = fd1 < ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
}
    Thought lo4 = Thought0.getInstance();
    double ld5 = 46.343708934424136;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld1, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld5, ad1, ad2, ad3, fb0, fb1, lb0, lb3);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld1, ld5);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld1;
    boolean lb6 = true;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb3);
}
    double ld7 = 621.0961989933854;

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
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought7.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    boolean lb2 = true;
    Output.points[1][8] -= fd0;
    Thought lo3 = Thought5.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
    boolean lb4 = false;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    lb4 = fb0 || fb1;
    fd1 = fd0 - fd1;
    double ld5 = 802.2592178537027;
    lb0 = !lb2;
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return ld5;
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
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo1.m1();
}
    fb0 = !fb1;
    lb0 = ab1 || ab2;
    boolean lb1 = false;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb1 = ab1 || ab2;

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
    boolean lb0 = false;
    Thought lo1 = Thought45.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    lb0 = ad1 > ad2;
    fb0 = !fb1;
    ad3 *= -1;
if(fo1 != null){
      fo1.m3();
}
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = lb2 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought30.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    Thought lo4 = Thought10.getInstance(fb1, lb0, lb2, fb0);
    ad3 = ad4 + fd0;
    if (fb1) {
        fd1 *= -1;
        lb0 = lb2 && fb0;
if(fo1 != null){
          fb1 = fo1.m2();
}
        lb0 = ad1 > ad2;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !ab1;
    double ld0 = 306.8104724928215;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    double ld1 = 166.47353142067507;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    ab4 = fd1 > ld0;
    ld1 *= -1;
    Thought lo2 = Thought64.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb0 = fb1 && ab1;
    boolean lb3 = true;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb4, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[2][0] -= fd0;
    lb4 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = lb3 || lb4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Output.points[2][1] += fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        Output.points[2][2] -= fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4();
}
        }
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought35.getInstance(ao1, ao2, ao3, ao4);
    lb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = lb0 || lb1;
    Output.points[2][3] += fd1;
    fb0 = fb1 && lb0;
        Output.points[2][4] += fd0;

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
    double ld0 = 214.80537820349338;
    fb1 = !fb0;
    Thought lo1 = Thought0.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1);
}
    fb1 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        ad1 = ad2 + ad3;
if(ao2 != null){
          ao1 = ao2.m4();
}
        for(int i1=0; i1<10; i1++){
            fb1 = ad4 < fd0;
if(ao4 != null){
              ao3 = ao4.m4(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
            fb0 = fb1 && fb0;
if(fo0 != null){
              ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
            Thought lo2 = Thought94.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
            }
        boolean lb3 = true;
        boolean lb4 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought51.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought82.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);

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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 || ab1;
    double ld0 = 738.5727943710239;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      ao1.m2(ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(ao2 != null){
          ad1 = ao2.m3();
}
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        Output.points[2][5] -= fd1;
        ld0 *= -1;
        Output.points[2][6] += ad1;
        fb0 = fb1 || ab1;
        ab2 = !ab3;
        ab4 = fb0 || fb1;
        ab1 = ad2 > ad3;
        ad4 = fd0 + fd1;
        boolean lb1 = false;
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
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
    double ld0 = 369.9275109252676;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought73.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought55.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    Thought lo4 = Thought7.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb3, fb0, fb1, lb3);
    boolean lb5 = false;
    lb5 = fd1 < ld0;
        fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, lb5, fb0);
}
    fb1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    Thought lo6 = Thought29.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    lb3 = fd0 < fd1;
    if (lb5) {
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[2][7] += fd0;
    ab1 = fd1 > fd0;
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3();
}
    ab1 = !ab2;
    Output.points[2][8] += fd0;
    Output.points[3][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;
    Thought lo1 = Thought44.getInstance(fo1, fo0, fo1, fo0);
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    double ld2 = 434.21476734562793;

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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Output.points[3][1] += fd1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought86.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fb1 = ad4 < fd0;
    fd1 *= -1;
    ad1 *= -1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(ad2, ad3, ad4, fd0);
}
        Thought lo3 = Thought93.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
        ad4 = fd0 - fd1;
        ad1 = ad2 + ad3;
        ad4 = fd0 - fd1;
        double ld4 = 604.9405794537661;
        lb0 = lb2 && fb0;
        ld4 = ad1 - ad2;
        double ld5 = 987.213759826094;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb2, fb0);
}
        fb1 = ad2 > ad3;
if(fo0 != null){
          ad4 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld4, ld5, lb0, lb2, fb0, fb1);
}
        ad1 = ad2 + ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
        lb0 = fd0 > fd1;
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
    ab2 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld0 = 100.50817455359021;
        fb0 = ad2 < ad3;
    Thought lo1 = Thought21.getInstance(ad4, fd0, fd1, ld0);
    double ld2 = 186.4026812214781;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ld2, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ld0 *= -1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb0, fb1, ab1, ab2);
}
    ad1 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought79.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    double ld1 = 555.0650270225234;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
    double ld3 = 414.2733687317591;
if(ao3 != null){
      fb0 = ao3.m2(ld1, ld3, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    ld1 *= -1;
    lb2 = ld3 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, ld3, fd0, fb0, fb1, lb2, fb0);
}
        fb1 = lb2 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb2, fb0, fb1);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        lb2 = ld1 > ld3;
if(ao3 != null){
          fb0 = ao3.m2(fd0, fd1, ld1, ld3);
}
        boolean lb4 = true;
        fb0 = fd0 < fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld3, fd0, fd1);
}
        fb1 = lb4 && lb2;
if(ao4 != null){
          ld1 = ao4.m3(fb0, fb1, lb4, lb2);
}
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
    fb0 = ad2 > ad3;
    fb1 = ad4 < fd0;
    fb0 = !fb1;
    Thought lo0 = Thought2.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;

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
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    ab1 = ab2 && ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    if (ab2) {
        Thought lo1 = Thought74.getInstance(fd0, fd1, fd0, fd1);
        ab3 = fd0 > fd1;
        } else if (ab4) {
        Thought lo2 = Thought43.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
        fb0 = fb1 && lb0;
        fd0 = fd1 - fd0;
        boolean lb3 = false;
if(fo0 != null){
          ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
        ab4 = fd1 < fd0;
        fb0 = fd1 > fd0;
        fb1 = lb3 || lb0;
        double ld4 = 505.4626687269251;
        } else {
        ab2 = ab3 && ab4;
        Thought lo5 = Thought26.getInstance();
        fb0 = fd1 < fd0;
        fb1 = fd1 > fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ad4 = fd0 + fd1;
    Output.points[3][2] += ad1;
    Thought lo0 = Thought68.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    if (fb1) {
        double ld1 = 271.08840097070765;
        boolean lb2 = false;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        lb2 = !ab1;
        Thought lo3 = Thought56.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb2, ab1, ab2, ab3);
}
        ad2 = ad3 + ad4;
        } else {
if(ao3 != null){
          fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
        ad3 = ad4 - fd0;
        Output.points[3][3] -= fd1;
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
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
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought95.getInstance();
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    Thought lo1 = Thought89.getInstance();
    fd0 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    lb0 = !fb0;

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
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[3][4] -= fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
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
}
