package genetic;
import java.util.ArrayList;
class Thought11 extends Thought{
private static ArrayList<Thought11> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 292.36324003865434;
private double fd1 = 22.864526670640743;
private Thought fo0 = null;
private Thought fo1 = null;
Thought11 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought11 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought11 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought11 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought11 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought11 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought11 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought11 instance = new Thought11 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought10.getInstance();
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
        boolean lb1 = false;
        for(int i0=0; i0<10; i0++){
            fb0 = !fb1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought42.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][5] -= fd0;
    fb0 = fb1 || ab1;
    ab2 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld1 = 868.0495672281689;
    Output.points[8][6] -= fd0;
if(fo0 != null){
      ab3 = fo0.m2(fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = ld1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[8][7] += fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    fb1 = !fb0;
    boolean lb0 = false;
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    fd0 = fd1 + ad1;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought85.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    Thought lo3 = Thought29.getInstance(fd1, ad1, ad2, ad3);
    Output.points[8][8] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[0][0] -= ad4;
    lb0 = lb2 && fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    Thought lo4 = Thought10.getInstance(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 + ad2;

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
    ab2 = ad4 > fd0;
    ab3 = fd1 < ad1;
    Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    ab2 = fd1 < ad1;
    double ld1 = 217.00561207552693;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld3 = 231.44747280640442;
    fb1 = lb2 && ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3);
}
    double ld4 = 330.6992465512596;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3);
}
if(fo0 != null){
      fo0.m1(fb1, lb2, ab1, ab2);
}
    Output.points[0][1] -= ld4;
    ab3 = ab4 && fb0;
    boolean lb5 = true;
    ad1 = ad2 - ad3;

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
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought87.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
        for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Output.points[0][2] -= fd1;
        boolean lb1 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
        Output.points[0][3] -= fd0;
        double ld2 = 534.7360256904473;
        fb1 = fd0 > fd1;
        double ld3 = 402.73962527334675;
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
    Output.points[0][4] += ad1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 693.1228165322914;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    lb1 = fd1 > ld0;
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    fb1 = ad1 < ad2;
    Thought lo2 = Thought99.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    ld0 = ad1 - ad2;
    ad3 *= -1;
    boolean lb3 = true;
    lb1 = !lb3;
    double ld4 = 873.1298331346035;
    fb0 = !fb1;
    lb1 = lb3 && fb0;
if(ao1 != null){
      ad3 = ao1.m3(fb1, lb1, lb3, fb0);
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
    boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[0][5] -= fd0;
    boolean lb1 = true;
    ab4 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb2 = false;
    ab4 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought41.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo4 = Thought69.getInstance(fb1, lb0, lb1, lb2);

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad3 = ad4 - fd0;
    ab4 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought80.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
    fd0 *= -1;
    Thought lo1 = Thought34.getInstance(fd1, ad1, ad2, ad3);
    Output.points[0][6] += ad4;
    fd0 = fd1 - ad1;
    Thought lo2 = Thought99.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    if (ab2) {
        double ld3 = 964.4788304302606;
        fd0 = fd1 - ld3;
        double ld4 = 636.9513400422309;
        ab3 = ld4 < ad1;
if(ao1 != null){
          fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ab2 = ao2.m2();
}
        ab3 = !ab4;
        fb0 = ad2 < ad3;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    double ld2 = 114.63988688010053;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = ld2 > fd0;
    Thought lo3 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
        fd1 *= -1;
    double ld4 = 466.7006218511375;
    Output.points[0][7] -= ld2;
    fb0 = fb1 && lb0;
    lb1 = fb0 && fb1;
    Thought lo5 = Thought24.getInstance(lb0, lb1, fb0, fb1);
    boolean lb6 = true;
    double ld7 = 383.5687039800356;
    ld4 = ld7 - fd0;

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
if(fo0 != null){
      ab2 = fo0.m2();
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought98.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;

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
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = !lb2;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ab1 = fo0.m2();
}
    boolean lb3 = true;
    double ld4 = 168.82837243418354;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
}
    Output.points[0][8] -= ad1;
    boolean lb5 = false;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld4;
    Output.points[1][0] += ad1;
    boolean lb6 = false;
    ab3 = ad2 > ad3;
    ab4 = fb0 || fb1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, lb1, lb2, lb3, lb5);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought34.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    if (fb0) {
        fd0 *= -1;
        fb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        double ld1 = 301.1895795862981;
        fb1 = ld1 < fd0;
        fd1 = ld1 - fd0;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fd1 *= -1;
if(fo1 != null){
          fo1.m3(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - ld1;
        fb0 = fd0 < fd1;
        double ld2 = 368.71090315437544;
        boolean lb3 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ld1, ld2, fd0, fd1, fb0, fb1, lb3, fb0);
}
        Output.points[1][1] += ld1;
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
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
        Output.points[1][2] -= ad2;
    boolean lb1 = true;
    Output.points[1][3] -= ad3;
    lb1 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;

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
    boolean lb0 = false;
    Output.points[1][4] += fd1;
    lb0 = !ab1;
    Output.points[1][5] -= fd0;
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
    if (lb0) {
if(ao1 != null){
          ao1.m1(ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought16.getInstance();
        fb0 = fd0 < fd1;
        fd0 *= -1;
        } else if (fb1) {
        double ld2 = 150.77510937332192;
        Output.points[1][6] -= fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[1][7] -= fd0;
    boolean lb0 = false;
    if (fb0) {
        fb1 = lb0 || ab1;
        fd1 = ad1 - ad2;
        ad3 = ad4 - fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought12.getInstance(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
        boolean lb2 = false;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        boolean lb3 = false;
        Output.points[1][8] += fd1;
if(ao3 != null){
          ao3.m1(ab2, ab3, ab4, fb0);
}
        fb1 = ad1 > ad2;
        double ld4 = 673.2458343864456;
        lb2 = lb3 || lb0;
if(fo0 != null){
          ao4 = fo0.m4();
}
        Output.points[2][0] += ad2;
        ad3 = ad4 + fd0;
        boolean lb5 = true;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Output.points[2][1] += fd0;
    fb1 = fd1 > fd0;
    Thought lo0 = Thought99.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 + fd1;
    fb1 = !fb0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 328.6693736344207;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
    ab4 = fd1 > fd0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    boolean lb2 = false;
    ab3 = ab4 || fb0;
    fb1 = lb0 && lb1;
    lb2 = fd1 < fd0;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        boolean lb3 = false;
if(fo1 != null){
          fd1 = fo1.m3();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    double ld0 = 279.9578273544106;
    fb1 = ad3 > ad4;
    boolean lb1 = false;
    Thought lo2 = Thought43.getInstance(fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    boolean lb3 = false;
    lb3 = fd1 > ld0;
    double ld4 = 86.40410209551972;
    ld4 = ad1 - ad2;
        fb0 = fb1 && lb1;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb3);
}
    double ld5 = 901.5275964166281;
    fb0 = fb1 || lb1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      ld0 = fo1.m3(ld4, ld5, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb3);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought43.getInstance();
    Output.points[2][2] -= ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    Thought lo2 = Thought32.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
    double ld3 = 316.72502273691276;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    double ld4 = 534.4389727618759;
    ad4 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld3, ld4);
}
    fb0 = ad1 < ad2;
    Thought lo5 = Thought43.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    fb1 = lb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb6 = false;
    ld3 = ld4 - ad1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb7 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb1, lb6, lb7, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ld3 + ld4;

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
    double ld0 = 202.45173163017355;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought96.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
    fd1 = ld0 - fd0;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought85.getInstance(fb0, fb1, fb0, fb1);
    Thought lo3 = Thought22.getInstance();
    fd1 *= -1;
    Thought lo4 = Thought49.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld0;
    double ld5 = 877.3287172871106;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought9.getInstance(ao2, ao3, ao4, fo0);
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 228.56922893668113;
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ad1);
}
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    lb2 = ld1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    boolean lb3 = false;
    lb3 = ld1 < ad1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(lb2, lb3, fb0, fb1);
}
    boolean lb4 = false;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    lb2 = fd1 < ld1;

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
    fd0 = fd1 + fd0;
if(ao2 != null){
      ab2 = ao2.m2();
}
    ab3 = fd1 > fd0;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought14.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;

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
    boolean lb0 = true;
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought18.getInstance(ab4, fb0, fb1, lb0);
    ab1 = ab2 && ab3;
    ab4 = fd1 > ad1;
    Output.points[2][3] -= ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = !lb0;

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
    fb1 = fd1 > fd0;
    Output.points[2][4] -= fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought36.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    if (fb1) {
        fd0 = fd1 - fd0;
        fd1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
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
    ab2 = !ab3;
    Output.points[2][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought42.getInstance(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    if (fb1) {
        lb0 = lb1 || ab1;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        double ld3 = 274.92823264937573;
        ld3 *= -1;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld3, fd0);
}
        fd1 = ld3 + fd0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(lb4, lb0, lb1, ab1);
}
        } else if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4();
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Thought lo0 = Thought91.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    Output.points[2][6] -= ad2;
    boolean lb1 = true;
    Thought lo2 = Thought23.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = lb1 && fb0;
    fd1 *= -1;
    fb1 = ad1 > ad2;
    Thought lo3 = Thought47.getInstance(lb1, fb0, fb1, lb1);
    boolean lb4 = false;
    Thought lo5 = Thought7.getInstance();
    ad3 = ad4 - fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
        ab1 = !ab2;
            ad2 = ad3 + ad4;
    ab3 = fd0 > fd1;
    boolean lb0 = true;
    Output.points[2][7] += ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;

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
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    lb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    double ld2 = 162.09665834246925;
    lb0 = fd0 < fd1;
    lb1 = fb0 && fb1;
    lb0 = lb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld2 = fd0 + fd1;
    Output.points[2][8] += ld2;
    fd0 = fd1 + ld2;
    fd0 = fd1 + ld2;
    fb1 = lb0 && lb1;
    fb0 = fd0 > fd1;
    fb1 = ld2 < fd0;
    Output.points[3][0] += fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
    double ld3 = 575.9446210587614;
    ld3 = fd0 + fd1;
    lb0 = ld2 > ld3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              fd0 = ao1.m3(fd1, ld2, ld3, fd0);
}
            lb1 = !fb0;
}}
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
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    Thought lo0 = Thought62.getInstance(fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
    if (fb0) {
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
        Output.points[3][1] += ad1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    ab4 = fd1 > fd0;
    fb0 = fb1 && ab1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought67.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    Output.points[3][2] += fd0;
    Output.points[3][3] -= fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
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
    ad1 = ad2 + ad3;
        boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
    Thought lo1 = Thought45.getInstance(fo0, fo1, ao1, ao2);
    boolean lb2 = true;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, lb0, lb2, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    fb0 = !fb1;
    double ld4 = 871.9512386764842;
        lb0 = lb2 || lb3;
if(ao3 != null){
      ab1 = ao3.m2(ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld4, ad1, ad2);
}
    ad3 *= -1;

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
    Output.points[3][4] -= fd0;
    boolean lb0 = true;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 *= -1;
    double ld0 = 516.4945810649713;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    fd0 = fd1 - ld0;
    boolean lb2 = false;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
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
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    Thought lo0 = Thought47.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 340.1577120426178;
    double ld3 = 756.2573360940439;
    lb1 = fb0 && fb1;
    ld2 = ld3 - fd0;
    lb1 = fd1 < ld2;
    Thought lo4 = Thought51.getInstance(ld3, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
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
}
