package genetic;
import java.util.ArrayList;
class Thought56 extends Thought{
private static ArrayList<Thought56> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 946.5272631657017;
private double fd1 = 749.3252383317661;
private Thought fo0 = null;
private Thought fo1 = null;
Thought56 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought56 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought56 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought56 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought56 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    Output.points[8][6] -= fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    double ld2 = 934.5008594216226;
    double ld3 = 560.8611223528234;
if(fo0 != null){
      fo0.m3(ld2, ld3, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
}
    lb0 = !lb1;
    ld2 *= -1;
    fb0 = fb1 || lb0;
    double ld4 = 744.5404307795452;
    ld3 = ld4 - fd0;
    lb1 = fd1 > ld2;
if(fo0 != null){
      ld3 = fo0.m3(ld4, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    ld3 = ld4 + fd0;
    boolean lb5 = true;
    lb5 = fb0 && fb1;
    lb0 = !lb1;
    boolean lb6 = true;

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
      fo1 = fo0.m4();
}
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought66.getInstance(fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][7] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab2 = fd0 > fd1;
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    fd0 *= -1;
    double ld2 = 728.0311297646934;
    Output.points[8][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    Output.points[0][0] -= ld2;
    fd0 = fd1 - ld2;
    ab4 = fd0 < fd1;

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
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    if (lb0) {
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        lb0 = ad4 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, lb0, fb0);
}
        fb1 = ad1 > ad2;
        lb0 = fb0 || fb1;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        fb0 = ad4 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    Thought lo0 = Thought82.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought142.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    Output.points[0][1] += ad1;
    lb1 = lb2 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
    ad3 *= -1;

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
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
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
    fb1 = ad2 > ad3;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought262.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    Output.points[0][2] -= fd1;
    ad1 *= -1;
    lb1 = fb0 || fb1;
    lb1 = fb0 && fb1;
    boolean lb2 = false;
    ad2 = ad3 - ad4;
    Thought lo3 = Thought72.getInstance(ao4, fo0, fo1, ao1, lb1, lb2, fb0, fb1);
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    lb1 = lb2 || fb0;
    boolean lb4 = true;
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    if (lb2) {
if(ao2 != null){
          ao2.m3();
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[0][3] += fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld1 = 444.70768171307;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought266.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
    Output.points[0][4] += fd1;
if(ao3 != null){
      ld1 = ao3.m3();
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    ab4 = fb0 || fb1;
    Output.points[0][5] -= fd1;
    boolean lb4 = false;
    lb0 = lb3 && lb4;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    ld1 *= -1;

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
    boolean lb0 = true;
    Thought lo1 = Thought342.getInstance(ad2, ad3, ad4, fd0);
    Thought lo2 = Thought288.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    Output.points[0][6] -= ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    ab4 = ad3 > ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb3);
}
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    boolean lb4 = true;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ad3 = ao3.m3(ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
        lb0 = !lb3;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1, lb4, ab1, ab2, ab3);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    fd1 = fd0 - fd1;
        double ld1 = 313.74965468926274;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    lb0 = ld1 < fd0;
    lb2 = fb0 && fb1;
    lb0 = lb2 && fb0;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1();
}
    fd1 *= -1;
    fb0 = fb1 && lb0;
    lb2 = lb3 && fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, lb3, fb0);
}
    Thought lo4 = Thought115.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    for(int i0=0; i0<10; i0++){
        lb0 = fd1 < ld1;
        boolean lb5 = true;
        Thought lo6 = Thought73.getInstance(fd0, fd1, ld1, fd0, lb0, lb2, lb3, fb0);
        boolean lb7 = true;
        boolean lb8 = false;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 985.0394522167348;
    if (lb0) {
        lb1 = ab1 || ab2;
        double ld3 = 539.6036223668565;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld3, ld2, fd0, fd1);
}
if(fo1 != null){
          fo1.m2(ld3, ld2, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab4 = ld3 < ld2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld2, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + ld3;
        Thought lo4 = Thought11.getInstance(fo0, fo1, fo0, fo1);
        double ld5 = 632.8239937940981;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought199.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ad4 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 - ad3;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought307.getInstance(fb1, lb1, fb0, fb1);
    boolean lb3 = false;
    boolean lb4 = true;

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
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
if(fo1 != null){
          ab4 = fo1.m2();
}
        fb0 = !fb1;
        Output.points[0][7] -= fd0;
        ab1 = ab2 || ab3;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        boolean lb0 = false;
        Thought lo1 = Thought140.getInstance(ab2, ab3, ab4, fb0);
        boolean lb2 = true;
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb2 = ab1 || ab2;
        ad4 = fd0 - fd1;
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    double ld0 = 977.7643259996272;
    fb0 = fb1 && fb0;
    fd0 = fd1 + ld0;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1();
}
    if (fb0) {
        fd0 = fd1 - ld0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
        lb1 = fd1 > ld0;
        fd0 = fd1 + ld0;
if(ao3 != null){
          fd0 = ao3.m3(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb1 = lb1 && fb0;
        double ld2 = 466.4690740357023;
        Output.points[0][8] -= fd0;
if(ao4 != null){
          fb1 = ao4.m2(fd1, ld2, ld0, fd0);
}
        double ld3 = 311.81976118555326;
        fd0 = fd1 - ld2;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, ld0, fd0, fd1);
}
        ld2 = ld3 - ld0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    double ld0 = 381.47387837070664;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought107.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld2 = 245.4901096592325;
    if (fb1) {
if(ao1 != null){
          fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
        Output.points[1][0] -= ad2;
        Output.points[1][1] += ad3;
        boolean lb3 = true;
        fb0 = fb1 && lb3;
        fb0 = ad4 < fd0;
        fb1 = lb3 && fb0;
        fd1 = ld0 + ld2;
        fb1 = lb3 && fb0;
        fb1 = lb3 || fb0;
        ad1 = ad2 - ad3;
        ad4 *= -1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Thought lo1 = Thought260.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = !lb0;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = fb1 && lb0;
if(ao2 != null){
      fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || lb0;

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
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ad2 > ad3;
    Thought lo0 = Thought162.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
    ab2 = ad4 < fd0;
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    Output.points[1][2] += ad4;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    Output.points[1][3] -= fd0;
    ab1 = ab2 || ab3;
    Output.points[1][4] += fd1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 52.81515706428725;
    double ld2 = 260.47346908527766;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    double ld3 = 979.1838678158987;
    fb1 = !lb0;
if(fo0 != null){
      fo0.m1(ld1, ld2, ld3, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo4 = Thought197.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    fd1 = ld1 + ld2;
    double ld5 = 743.4018936121889;
    boolean lb6 = true;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Output.points[1][5] += fd0;
    fd1 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, ab1);
}
    boolean lb2 = true;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought88.getInstance(fd0, fd1, fd0, fd1);
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb4 = false;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb4, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab3 = !ab4;
    boolean lb5 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        lb1 = !lb2;
        boolean lb6 = false;
if(fo1 != null){
          lb2 = fo1.m2(lb4, lb5, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    double ld0 = 961.7893713348066;
    ad3 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought132.getInstance(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    fb0 = !fb1;
    lb2 = ad3 > ad4;
    fd0 = fd1 - ld0;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fd1 = ld0 + ad1;
        fb0 = ad2 < ad3;
        boolean lb3 = false;
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb3, lb2, fb0);
}
        boolean lb4 = true;
        double ld5 = 293.5880077083315;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld5, ld0, ad1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        Output.points[1][6] -= ad1;
        ab3 = ab4 || fb0;
        boolean lb0 = false;
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        Output.points[1][7] += ad3;
        ad4 = fd0 - fd1;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
        Thought lo1 = Thought201.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
        Thought lo2 = Thought193.getInstance();
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
        ab3 = ad4 > fd0;
        fd1 = ad1 + ad2;
        double ld3 = 406.98967746888076;
        boolean lb4 = true;
        ad2 = ad3 - ad4;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
            Thought lo5 = Thought363.getInstance(fo0, fo1, fo0, fo1);
            boolean lb6 = true;
}}
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld0 = 429.7069010156758;
    Output.points[1][8] -= fd0;
    boolean lb1 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    lb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
    Output.points[2][0] += fd0;
if(ao4 != null){
      ao4.m1();
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
    fb0 = fd0 > fd1;
    Thought lo2 = Thought101.getInstance(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
    Thought lo3 = Thought10.getInstance(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    boolean lb4 = true;
    ld0 = fd0 - fd1;
    lb4 = !fb0;
    ld0 = fd0 + fd1;
if(ao3 != null){
      fb1 = ao3.m2();
}
    Thought lo5 = Thought135.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, lb1, lb4, fb0, fb1);
    lb1 = fd0 > fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][1] += ad2;
if(ao2 != null){
      ad3 = ao2.m3(fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    fb1 = !fb0;
    ad3 = ad4 - fd0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Output.points[2][2] -= ad2;
    Thought lo0 = Thought200.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = true;
    Thought lo3 = Thought324.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
    lb1 = !lb2;
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao2.m3(fb1, lb1, lb2, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = !lb1;
    Thought lo4 = Thought160.getInstance(ad3, ad4, fd0, fd1);
    lb2 = ad1 < ad2;
    fb0 = fb1 || lb1;

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
    ab2 = !ab3;
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab4 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb0 = false;
    ab4 = fd1 > fd0;
    boolean lb1 = true;
    Output.points[2][3] += fd1;
    fd0 = fd1 - fd0;
    Output.points[2][4] += fd1;
    ab4 = fb0 || fb1;
    lb0 = fd0 > fd1;
    double ld2 = 287.11934454470014;
    lb1 = !ab1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(ao1 != null){
      ab2 = ao1.m2();
}
    ab3 = ad4 < fd0;
    boolean lb0 = true;
    ab3 = fd1 < ad1;
    Thought lo1 = Thought168.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    boolean lb2 = true;
    Output.points[2][5] += ad2;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb0;
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
        lb2 = ab1 || ab2;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    fb1 = !lb0;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][6] -= fd1;
    fb1 = !fb0;
    Output.points[2][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 145.06554708911824;
    for(int i0=0; i0<10; i0++){
        double ld1 = 596.0750420530732;
        ld1 *= -1;
        Thought lo2 = Thought61.getInstance();
        double ld3 = 887.4639772101291;
        ld3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = ld3 > ld0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ld1;
        Output.points[2][8] -= ld3;
        fb0 = ld0 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(ld1, ld3, ld0, fd0);
}
        Thought lo4 = Thought145.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld3, ld0);
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, ld3, ld0, fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
        double ld5 = 784.6081351486665;
        fd0 = fd1 - ld1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = fd0 > fd1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought163.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought131.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    double ld2 = 971.4785700366878;
    double ld3 = 565.2424013844997;
    boolean lb4 = false;
    ld2 *= -1;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ld3 > fd0;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][0] += fd1;

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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought277.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    lb1 = ad4 > fd0;
    fb0 = fd1 < ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    ad2 *= -1;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
}
    ad3 *= -1;
    fb0 = ad4 > fd0;
        boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb4, fb0, fb1, lb1);
}
    lb2 = lb3 || lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb1;
    boolean lb5 = true;
    double ld6 = 954.8685253492968;
    ld6 = ad1 - ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = !ab3;
    if (ab4) {
        Output.points[3][1] -= fd0;
        fb0 = fb1 || ab1;
if(fo1 != null){
          ab2 = fo1.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        Output.points[3][2] -= ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fd1 = ad1 - ad2;
        boolean lb0 = true;
        ab4 = ad3 < ad4;
        if (fb0) {
if(fo1 != null){
              fo1.m2();
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
            ab3 = ad3 > ad4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb1 = false;
    lb0 = !lb1;
    double ld2 = 909.4571656094618;
    fb0 = ld2 > ad1;
    boolean lb3 = true;

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
    double ld0 = 969.4264215123787;
    ld0 *= -1;
    Output.points[3][3] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought140.getInstance(fb1, ab1, ab2, ab3);
    Thought lo2 = Thought330.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    if (ab4) {
        fb0 = fb1 || ab1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
        boolean lb3 = false;
        ab1 = !ab2;
        ab3 = !ab4;
if(ao1 != null){
          fo1 = ao1.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb3, ab1);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb1 = fd1 > ld0;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(ao2 != null){
          ao2.m2(ab4, fb0, fb1, lb3);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        Output.points[3][4] += ld0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    double ld0 = 285.1088316300651;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    double ld1 = 196.8452098663323;
    double ld2 = 268.27840977112163;
if(ao3 != null){
      ao2 = ao3.m4(ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought9.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
if(ao2 != null){
      ao2.m3();
}
    ab4 = ad4 < fd0;
    fb0 = fd1 < ld0;
    fb1 = ld1 < ld2;
    Output.points[3][5] += ad1;
    ad2 *= -1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb4, ab1);
}
        ld0 = ld1 + ld2;
        ad1 = ad2 - ad3;
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb1 = lb0 || fb0;
    Thought lo1 = Thought302.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought392.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !lb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld2 = 575.1549391157594;
    boolean lb3 = true;
    boolean lb4 = false;
    boolean lb5 = false;
    lb3 = lb4 || lb5;
    boolean lb6 = false;
    double ld7 = 363.74920255461785;
    lb6 = ld7 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld7, fd0, fd1);
}
    ld2 = ld7 - fd0;

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
    Output.points[3][6] += fd1;
    double ld0 = 486.87867223526905;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
            fb0 = fb1 && fb0;
    fb1 = !fb0;
    fd0 *= -1;
    double ld1 = 279.1249826376109;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
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
