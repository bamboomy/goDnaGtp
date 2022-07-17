package genetic;
import java.util.ArrayList;
class Thought5 extends Thought{
private static ArrayList<Thought5> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 175.0590674352524;
private double fd1 = 618.4552824243103;
private Thought fo0 = null;
private Thought fo1 = null;
Thought5 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought5 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought5 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought5 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought5 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought5 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought5 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought5 instance = new Thought5 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought201.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought349.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo3 = Thought357.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 951.0879648446918;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought1.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
    lb2 = ab1 || ab2;
    ab3 = ab4 || fb0;
    boolean lb4 = true;
    double ld5 = 552.0488607595254;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb1, lb2);
}
    ld0 = ld5 - fd0;

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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    Thought lo0 = Thought144.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = true;
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;

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
    double ld0 = 550.7023996974776;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    ld0 *= -1;
    Output.points[1][1] += ad1;
if(fo1 != null){
      fo1.m1();
}
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = lb1 && ab1;
    Output.points[1][2] += ad1;
    boolean lb2 = true;
if(fo1 != null){
      ad2 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (fb0) {
        Output.points[1][3] -= ad3;
        fb1 = !lb1;
        lb2 = ab1 && ab2;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          ab3 = fo0.m2(fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb1);
}
        lb2 = ab1 && ab2;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = ad2 > ad3;
        } else if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4();
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
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    double ld2 = 810.592994931526;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    lb0 = lb1 && fb0;
    fb1 = fd1 > ld2;
    Output.points[1][4] += fd0;
    lb0 = lb1 && fb0;
    fb1 = fd1 > ld2;
    Output.points[1][5] += fd0;
    lb0 = !lb1;
if(ao3 != null){
      fb0 = ao3.m2(fd1, ld2, fd0, fd1);
}
    boolean lb3 = false;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    lb3 = fd1 > ld2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    double ld2 = 48.60614152895321;
    lb1 = ad2 < ad3;
    fb0 = !fb1;
    lb0 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld2, ad1, ad2, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    Thought lo3 = Thought388.getInstance();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
    Thought lo0 = Thought61.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    fd1 = fd0 + fd1;
    double ld1 = 670.137105264265;
    ab2 = ab3 && ab4;
    Thought lo2 = Thought123.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
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
    Thought lo0 = Thought255.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        double ld1 = 143.91282748160583;
        boolean lb2 = true;
if(ao1 != null){
          ad2 = ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(ad4, fd0, fd1, ld1);
}
        fb1 = lb2 && ab1;
        ab2 = ad1 > ad2;
        ad3 = ad4 - fd0;
        Thought lo3 = Thought41.getInstance(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2);
if(fo1 != null){
          ab3 = fo1.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
        boolean lb4 = false;
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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    double ld2 = 785.059239599565;
    boolean lb3 = false;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb3 = ld2 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ld2 = fd0 + fd1;
    Thought lo4 = Thought0.getInstance(lb3, fb0, fb1, lb0);
    ld2 = fd0 - fd1;
    Thought lo5 = Thought108.getInstance(fo0, fo1, fo0, fo1);
    lb1 = ld2 < fd0;
    fd1 = ld2 - fd0;
    lb3 = !fb0;
    fb1 = !lb0;
    fd1 = ld2 + fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 348.4033084038249;
    Thought lo1 = Thought199.getInstance(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought145.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    ab4 = fd1 > ld0;
    fb0 = fd0 > fd1;
    fb1 = ld0 > fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1();
}
        boolean lb3 = false;
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Thought lo4 = Thought67.getInstance(fb0, fb1, lb3, ab1);
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        ab2 = ld0 < fd0;
        boolean lb5 = false;
        ab2 = ab3 || ab4;
if(fo1 != null){
          fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo1.m1(fd1, ld0, fd0, fd1, fb1, lb3, lb5, ab1);
}
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
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought22.getInstance(fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld1 = 100.48268624989099;
    fb0 = ld1 < ad1;
    double ld2 = 929.9171894746148;
    boolean lb3 = false;
    double ld4 = 834.0229472812046;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld4, ad1, ad2, ad3);
}
    Thought lo6 = Thought295.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
    lb5 = !fb0;
    fb1 = lb3 && lb5;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld4, ad1, ad2, ad3, fb0, fb1, lb3, lb5);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb5);
}
    ad4 *= -1;
    fd0 = fd1 + ld1;
    fb0 = fb1 && lb3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, lb5, fb0, fb1, lb3);
}
    if (lb5) {
        ad4 *= -1;
        Thought lo7 = Thought14.getInstance(fb0, fb1, lb3, lb5);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ab2 = ab3 && ab4;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 > ad4;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    ab1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    lb1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo3 = Thought382.getInstance(ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          ao1.m1(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought258.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 152.44023624016464;
    fb1 = ad4 < fd0;
    boolean lb2 = true;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3);
}
    lb2 = ad4 > fd0;
    fb0 = !fb1;
if(fo1 != null){
      lb2 = fo1.m2(fd1, ld1, ad1, ad2, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    double ld3 = 497.8399212759966;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
    boolean lb4 = false;

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
      fd0 = ao1.m3();
}
        Output.points[1][6] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought82.getInstance(fb0, fb1, lb0, ab1);
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 + fd1;
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    lb0 = !lb2;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
    lb2 = fd1 < fd0;
if(ao3 != null){
      ab1 = ao3.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 || lb2;

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
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 = ad4 - fd0;
    ab3 = fd1 < ad1;
    ab4 = ad2 > ad3;
    ad4 *= -1;
    boolean lb0 = true;
    ab4 = !fb0;
        fb1 = fd0 < fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    double ld1 = 487.7983875517999;
    lb0 = ab1 && ab2;
    ad2 *= -1;
    Thought lo2 = Thought136.getInstance(ab3, ab4, fb0, fb1);

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought358.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    fb0 = fd0 > fd1;
    double ld3 = 144.631281073201;
    boolean lb4 = true;
    fb0 = ld3 < fd0;
    for(int i0=0; i0<10; i0++){
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
    fd0 *= -1;
    Output.points[1][7] -= fd1;
    Thought lo0 = Thought48.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fd0 = fd1 - fd0;
    Thought lo1 = Thought225.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    Output.points[1][8] += fd1;
    boolean lb2 = true;
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb2);
}
    boolean lb3 = true;
    double ld4 = 751.7814174899243;
    ld4 = fd0 - fd1;
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought5.getInstance(fd0, fd1, ld4, fd0);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4);
}
    lb3 = ab1 || ab2;
    Output.points[2][0] += fd0;
    fd1 *= -1;
    ld4 = fd0 + fd1;
if(fo1 != null){
      ab3 = fo1.m2(ld4, fd0, fd1, ld4, ab4, fb0, fb1, lb2);
}
        boolean lb6 = true;

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
    boolean lb0 = true;
    Thought lo1 = Thought349.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m2();
}
    ad1 = ad2 + ad3;
    fb1 = lb0 || fb0;
    Output.points[2][1] += ad4;
    fb1 = lb0 && fb0;
    double ld2 = 16.63790648968673;
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;

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
    ab1 = ad1 > ad2;
    boolean lb0 = false;
    ab1 = ad3 > ad4;
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    fb0 = !fb1;
    lb0 = !ab1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    lb0 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 + fd0;
    ab4 = fd1 > ad1;
    boolean lb1 = false;
    Output.points[2][2] += ad2;
    Output.points[2][3] -= ad3;
    ab4 = fb0 || fb1;
    boolean lb2 = false;
    lb0 = !lb1;
    ad4 = fd0 + fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought120.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Thought lo1 = Thought146.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[2][4] -= fd0;
    boolean lb2 = false;
        for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        }
    fd0 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    Output.points[2][5] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought97.getInstance();
    fb0 = ad1 < ad2;
        double ld2 = 439.9747726269704;
    Thought lo3 = Thought108.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
    double ld4 = 368.4439587607052;
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    Thought lo5 = Thought184.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 + ld2;
    Thought lo6 = Thought63.getInstance(ld4, ad1, ad2, ad3);
    fb0 = !fb1;
    boolean lb7 = true;
    lb0 = lb7 || fb0;
    fb1 = lb0 && lb7;

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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
          ab3 = ao2.m2();
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          fb0 = ao4.m2(fd0, fd1, fd0, fd1);
}
        Output.points[2][6] -= fd0;
        fb1 = fd1 < fd0;
        Thought lo1 = Thought166.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
        fd1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought135.getInstance();
    fb0 = fb1 || ab1;
    boolean lb1 = true;
    ad2 *= -1;
    if (ab1) {
        Thought lo2 = Thought319.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
        boolean lb3 = true;
        fb0 = ad1 < ad2;
        boolean lb4 = true;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb3, lb4);
}
if(ao1 != null){
          lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
        ab1 = !ab2;
if(fo1 != null){
          fo1.m2(fd1, ad1, ad2, ad3);
}
        ab3 = !ab4;
        if (fb0) {
            boolean lb5 = false;
            ad4 *= -1;
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 455.7578856642524;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    fb1 = fd1 < ld0;
    Thought lo2 = Thought32.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 < ld0;
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 = fd1 - ld0;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        ld0 *= -1;
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
        fb0 = !fb1;
        fb0 = !fb1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = ld0 - fd0;
        fb0 = fb1 && fb0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = ld0 > fd0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab1 = !ab2;
    fd1 *= -1;
if(fo1 != null){
      ab3 = fo1.m2();
}
    Output.points[2][7] += fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (ab1) {
        ab2 = fd1 > fd0;
        ab3 = fd1 > fd0;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        fd1 = fd0 - fd1;
        double ld0 = 353.6008059300032;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    fb1 = lb0 || lb1;
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought177.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[2][8] += ad2;
    boolean lb3 = true;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb0, lb1, lb3, fb0);
}
    fb1 = lb0 || lb1;
    boolean lb4 = true;
    lb3 = lb4 && fb0;
    boolean lb5 = false;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, lb3, lb4);
}
    lb5 = fb0 && fb1;
    lb0 = !lb1;

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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    for(int i0=0; i0<10; i0++){
        Output.points[3][0] += ad2;
        double ld0 = 811.5003968773705;
        ab2 = ab3 || ab4;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
        boolean lb1 = false;
        ab2 = ad3 < ad4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 407.828364594458;
    fb1 = fb0 || fb1;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    double ld1 = 33.18867809272857;
    fb1 = ld1 < fd0;
    fd1 *= -1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb2, fb0, fb1, lb2);
}
    Output.points[3][1] -= ld0;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb3 = false;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ld1, fd0);
}
    Thought lo4 = Thought132.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ld1, fd0);
    lb3 = fd1 > ld0;
    fb0 = ld1 < fd0;
    fb1 = lb2 || lb3;
    double ld5 = 153.44138930832068;
    fd0 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
        Thought lo0 = Thought344.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ad1;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    boolean lb2 = false;
    Output.points[3][2] -= ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb1, lb2, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 *= -1;
    Thought lo3 = Thought269.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb1, lb2, fb0, fb1);
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(fo1 != null){
      lb1 = fo1.m2(lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[3][3] += ad4;
    Thought lo4 = Thought272.getInstance(fd0, fd1, ad1, ad2);
    boolean lb5 = true;
    lb1 = lb2 || lb5;
    fb0 = ad3 > ad4;
    fb1 = lb1 && lb2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab1 = fd1 < fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    double ld0 = 976.8139976301093;
    Thought lo1 = Thought327.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    fb0 = ld0 > fd0;
    fb1 = !ab1;
        double ld2 = 652.1125212716523;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = false;

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
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    ab2 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
    Thought lo1 = Thought204.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab3 = ab4 || fb0;
    fb1 = !lb0;
    lb2 = !ab1;

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
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[3][4] -= fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    Output.points[3][5] += fd0;
    fb0 = fb1 || lb0;
    double ld1 = 225.1500712901375;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[3][6] += fd1;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    boolean lb2 = false;
    boolean lb3 = true;
    ld1 = fd0 - fd1;
    lb0 = ld1 > fd0;
    lb2 = lb3 && fb0;
    fd1 *= -1;
    Thought lo4 = Thought77.getInstance(fb1, lb0, lb2, lb3);
        fb0 = ld1 < fd0;
    fd1 = ld1 + fd0;
    boolean lb5 = true;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought16.getInstance();
    Output.points[3][7] += fd0;
    double ld2 = 542.4367068548885;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = ld2 > fd0;
    double ld3 = 198.12559029709385;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought383.getInstance(fd0, fd1, ld2, ld3);
    fd0 *= -1;
    boolean lb5 = true;
    lb5 = fb0 || fb1;
    lb0 = !lb5;
    fd1 *= -1;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
}
if(fo0 != null){
      ld2 = fo0.m3(ld3, fd0, fd1, ld2, lb6, fb0, fb1, lb0);
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    double ld0 = 897.2503774271512;
    Output.points[3][8] += ld0;
    Thought lo1 = Thought376.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    Thought lo2 = Thought289.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    Output.points[4][0] += fd0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
    fb0 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
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
