package genetic;
import java.util.ArrayList;
class Thought89 extends Thought{
private static ArrayList<Thought89> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 829.0050069354572;
private double fd1 = 375.88039262264243;
private Thought fo0 = null;
private Thought fo1 = null;
Thought89 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought89 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought89 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought89 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought89 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    lb0 = lb1 || fb0;
    fb1 = lb0 || lb1;
    fd0 *= -1;
    double ld2 = 905.9139524415406;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    double ld3 = 540.5972704751541;
    Output.points[6][4] += fd0;
    fd1 = ld2 + ld3;
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          ld2 = fo0.m3();
}
if(fo1 != null){
          fo1.m2(ld3, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ld3, fd0, fd1, ld2);
}
        lb0 = ld3 > fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, ld3, fd0);
}
        lb1 = fb0 && fb1;
        lb0 = fd1 < ld2;
        ld3 = fd0 - fd1;
        lb1 = ld2 > ld3;
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
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
        ab3 = ab4 || fb0;
        boolean lb0 = false;
if(fo1 != null){
          fo1.m2();
}
        double ld1 = 29.995580680628063;
        boolean lb2 = true;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        Output.points[6][5] -= ld1;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb2, ab1, ab2, ab3);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought2.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    fd0 = fd1 + ad1;
    lb1 = ad2 > ad3;
    fb0 = fb1 && lb1;
    ad4 = fd0 - fd1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld2 = 246.84289906995;

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
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought7.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought58.getInstance(fb1, ab1, ab2, ab3);
    double ld2 = 514.9568718400113;
    ab4 = fb0 || fb1;
    ab1 = fd0 > fd1;
    Output.points[6][6] += ld2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    double ld3 = 392.2045809338977;
    double ld4 = 400.4161040114126;

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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
    Output.points[6][7] -= fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought78.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        fd1 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
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
    ad1 = ad2 - ad3;
    Thought lo0 = Thought83.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    Output.points[6][8] -= ad3;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    double ld1 = 209.41880773446456;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || lb2;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb2, fb0);
}
    ld1 = ad1 + ad2;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
    ld1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb2 = fb0 || fb1;
    Thought lo3 = Thought46.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
}
    Output.points[7][0] += ld1;
    lb2 = !fb0;
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
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
    ab1 = !ab2;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    double ld0 = 3.167159025215348;
    ab1 = ab2 || ab3;
if(ao3 != null){
      fd0 = ao3.m3();
}
    Output.points[7][1] += fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    boolean lb1 = true;
    ab3 = ld0 < fd0;
if(ao4 != null){
      ao4.m3(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    double ld2 = 664.720493768097;
    double ld3 = 152.67220194010858;
    ld3 = fd0 - fd1;
    boolean lb4 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
    boolean lb5 = false;
    Thought lo6 = Thought45.getInstance(ld0, ld2, ld3, fd0);
    lb4 = !lb5;
    double ld7 = 855.6259304014209;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld2);
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
    boolean lb0 = false;
    ad1 *= -1;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought48.getInstance(ab4, fb0, fb1, lb0);
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ad1 *= -1;
    ab2 = ad2 < ad3;
    ab3 = ad4 < fd0;
if(ao4 != null){
      fd1 = ao4.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb2 = true;
    ab3 = !ab4;
    Thought lo3 = Thought13.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);

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
    Thought lo0 = Thought42.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought29.getInstance();
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    if (lb2) {
        fd1 *= -1;
        fd0 *= -1;
        Thought lo3 = Thought25.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
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
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab1 = ab2 || ab3;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    double ld3 = 448.8372636400826;
    Output.points[7][2] += fd0;
    boolean lb4 = true;
    fd1 *= -1;
    boolean lb5 = true;
    lb1 = ld3 > fd0;
if(fo0 != null){
      fo0.m3();
}
    fd1 = ld3 + fd0;
    Output.points[7][3] += fd1;
if(fo1 != null){
      lb2 = fo1.m2(ld3, fd0, fd1, ld3, lb4, lb5, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 > fd1;
    ld3 = fd0 - fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb1, lb2);
}
    lb4 = lb5 && ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    lb2 = fd0 < fd1;
    Thought lo6 = Thought71.getInstance(ld3, fd0, fd1, ld3);
        Output.points[7][4] += fd0;
    fd1 = ld3 + fd0;
    boolean lb7 = false;

Thought.STACK_COUNTER++;
return lb4;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
    double ld0 = 724.0543568319996;
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ld0 = ad1 - ad2;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought85.getInstance();
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
    double ld0 = 382.85981316152424;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ad4 < fd0;
    fb1 = fd1 > ld0;
    lb1 = ad1 < ad2;
    boolean lb2 = false;
    lb2 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
    fd0 *= -1;
    double ld3 = 401.1902856608639;
    double ld4 = 799.8582910574527;
    lb2 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld3, ld4, ab1, ab2, ab3, ab4);
}
    double ld5 = 281.5142969567298;
    fb0 = !fb1;
        double ld6 = 358.96758268990624;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, ld6, ad1, ad2, lb1, lb2, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 911.2674706245355;
    fd0 = fd1 + ld0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
        fb0 = fb1 || fb0;
        Thought lo1 = Thought72.getInstance(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
        fb1 = ld0 < fd0;
        fd1 = ld0 + fd0;
        fb0 = !fb1;
        boolean lb2 = true;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m1(lb2, fb0, fb1, lb2);
}
            fb0 = fb1 || lb2;
            fb0 = fb1 && lb2;
if(ao1 != null){
              fo1 = ao1.m4();
}
            fd1 *= -1;
            fb0 = fb1 || lb2;
            fb0 = ld0 < fd0;
if(ao2 != null){
              fb1 = ao2.m2(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    Thought lo1 = Thought32.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    Thought lo2 = Thought24.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
    fb1 = fd0 < fd1;
    double ld3 = 531.1012199100667;
    Output.points[7][5] -= ld3;
    lb0 = !fb0;
    boolean lb4 = false;
    fb0 = ad1 < ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
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
    double ld0 = 847.5517867582641;
    ab1 = !ab2;
    ld0 *= -1;
    boolean lb1 = true;
    ab2 = !ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || lb1;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    ab1 = ld0 > fd0;
    fd1 = ld0 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      ab4 = ao2.m2();
}
if(ao3 != null){
      fd1 = ao3.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
        Thought lo4 = Thought45.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, lb3, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      ao1.m3(fd1, ld0, fd0, fd1);
}
    lb2 = ld0 > fd0;
    double ld5 = 804.6504414258366;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 563.2561651725174;
    fb1 = ad4 > fd0;
    Thought lo1 = Thought84.getInstance();
    double ld2 = 37.0418406691188;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb3);
}
    fd0 = fd1 - ld0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[7][6] -= fd0;
    double ld1 = 568.3469436215007;
    fd0 *= -1;
    double ld2 = 800.9231395972456;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    ld1 = ld2 + fd0;
    fb0 = fd1 < ld1;
if(fo0 != null){
      fo0.m1(ld2, fd0, fd1, ld1);
}
    fb1 = !lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ld1;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        lb3 = !lb0;
        ld2 *= -1;
        boolean lb4 = false;
        fd0 = fd1 - ld1;
        boolean lb5 = true;
        lb5 = lb0 && fb0;
}
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
    ab1 = !ab2;
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    Output.points[7][7] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    double ld1 = 356.1013352826014;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1);
}
    boolean lb2 = false;
    fb0 = fb1 && lb0;
    lb2 = fd0 < fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    Thought lo3 = Thought7.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = !lb0;

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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    if (fb0) {
        Thought lo0 = Thought40.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
        fb1 = fb0 && fb1;
        if (fb0) {
            Output.points[7][8] -= ad4;
if(fo0 != null){
              fd0 = fo0.m3();
}
            for(int i0=0; i0<10; i0++){
                fd1 *= -1;
                }
            double ld1 = 538.1474947409198;
if(fo0 != null){
              fo1 = fo0.m4(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
            } else {
            if (fb1) {
}}}
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
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    double ld0 = 666.9223711641969;
    Thought lo1 = Thought62.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought77.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
    fd0 *= -1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    Thought lo3 = Thought39.getInstance(ab1, ab2, ab3, ab4);
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld4 = 16.610792427962913;
    Thought lo5 = Thought33.getInstance(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    fb0 = ad4 < fd0;
    boolean lb6 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb6, ab1, ab2);
}
    Output.points[8][0] += fd1;
    Thought lo7 = Thought51.getInstance(ld0, ld4, ad1, ad2);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
        boolean lb1 = true;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    boolean lb2 = true;
    Thought lo3 = Thought59.getInstance(ao3, ao4, fo0, fo1);
    lb0 = lb1 || lb2;
    fb0 = fd0 < fd1;
    Thought lo4 = Thought14.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
    boolean lb5 = true;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb5, lb6, fb0, fb1);
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
    boolean lb0 = false;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    lb0 = lb1 || fb0;
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        double ld2 = 201.12958812132553;
        }
    Output.points[8][1] -= ad1;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
    Output.points[8][2] += fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    boolean lb3 = true;

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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    double ld0 = 164.94763690173636;
        fb1 = ab1 || ab2;
    boolean lb1 = false;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(fo1 != null){
          fo1.m3(ab1, ab2, ab3, ab4);
}
        Output.points[8][3] -= fd1;
        fb0 = !fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = ad1 - ad2;
    double ld0 = 83.08154399808882;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb1 = false;
    ld0 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        double ld2 = 929.1700152835614;
        ab4 = fb0 && fb1;
        fd0 = fd1 + ld2;
        Thought lo3 = Thought90.getInstance(ao4, fo0, fo1, ao1);
        lb1 = ld0 > ad1;
        Output.points[8][4] += ad2;
        ad3 *= -1;
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld0, ab1, ab2, ab3, ab4);
}
        fb0 = ad1 > ad2;
        fb1 = !lb1;
        ab1 = ad3 > ad4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[8][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[8][6] += fd0;
    Thought lo0 = Thought4.getInstance();
    fb1 = !fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;

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
    Output.points[8][7] -= fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[8][8] += fd1;
if(fo0 != null){
          fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    double ld0 = 656.0670205987783;
    Output.points[0][0] -= fd0;
    double ld1 = 429.36302982816414;
    ab3 = fd0 > fd1;
    ld0 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
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
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought69.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought55.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        fb0 = ad3 > ad4;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        double ld2 = 263.90220748236163;
        boolean lb3 = true;
        Output.points[0][1] += ld2;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought2.getInstance(ab1, ab2, ab3, ab4);
        fb0 = ad2 > ad3;
    Thought lo1 = Thought55.getInstance();
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    Output.points[0][2] -= ad2;
    Thought lo3 = Thought97.getInstance(fo1, fo0, fo1, fo0);
    ad3 = ad4 + fd0;
    fb0 = fb1 || lb2;
    ab1 = fd1 > ad1;
    ad2 = ad3 + ad4;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    lb2 = fd0 < fd1;
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, ab1, ab2);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      fb1 = ao3.m2();
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    double ld0 = 739.1414268671002;
    fb1 = !fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    fb1 = !lb1;
    double ld2 = 385.20783578672143;
    double ld3 = 128.78241486692198;

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
    ad1 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = ad2 < ad3;
    Thought lo1 = Thought61.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    double ld2 = 563.3559283448782;
    fb0 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          ld2 = fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    ad1 *= -1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;

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
      ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
    double ld0 = 200.03515604230387;
    fb0 = fd0 > fd1;
    double ld1 = 926.4509056619007;
    Thought lo2 = Thought73.getInstance();
    boolean lb3 = true;
    fb0 = fb1 && lb3;
if(ao4 != null){
          ao4.m2(ld0, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < ld1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1, lb3, ab1, ab2, ab3);
}
    Output.points[0][3] += ld0;
    ab4 = fb0 || fb1;
        lb3 = !ab1;
    boolean lb4 = true;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb3;
    Output.points[0][4] += fd0;
    double ld5 = 731.7504083886543;

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
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ab2 = ad4 < fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 662.3501423591356;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab4 = ld1 < ad1;
    ad2 = ad3 - ad4;

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
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    double ld1 = 715.6851197162633;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      ld1 = fo0.m3(fb0, fb1, lb2, fb0);
}
        boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Output.points[0][5] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb2, lb3);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    boolean lb4 = false;
    lb4 = ld1 > fd0;
    double ld5 = 716.6511495126491;
    double ld6 = 361.35246135475205;
    ld6 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
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
    boolean lb0 = true;
    Thought lo1 = Thought11.getInstance(fd0, fd1, fd0, fd1);
    lb0 = fb0 && fb1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought12.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    lb0 = !fb0;
    Output.points[0][6] -= fd1;
    fd0 *= -1;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought94.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    Thought lo4 = Thought34.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    Output.points[0][7] += fd0;
    boolean lb5 = true;
    Output.points[0][8] += fd1;
    lb0 = fd0 < fd1;
    lb5 = fb0 && fb1;
    Thought lo6 = Thought0.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    Output.points[1][0] -= fd1;
    fd0 = fd1 - fd0;
    double ld1 = 630.6241551122979;
    fb1 = !lb0;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = ld1 < fd0;
    fb1 = !lb0;
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    lb3 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;
    fb0 = !fb1;
    lb0 = lb3 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb3, fb0);
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
