package genetic;
import java.util.ArrayList;
class Thought81 extends Thought{
private static ArrayList<Thought81> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 625.7227555294642;
private double fd1 = 860.6384103157632;
private Thought fo0 = null;
private Thought fo1 = null;
Thought81 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought81 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought81 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought81 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought81 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought81 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought81 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought81 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought81 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought81 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought81 instance = new Thought81 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
    Output.points[3][5] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    boolean lb3 = false;
    Output.points[3][6] -= fd0;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    lb0 = fd0 < fd1;
    double ld5 = 551.4206325714293;
    ld5 *= -1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld5, lb2, lb3, lb4, fb0);
}
    fd0 = fd1 + ld5;
        fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, lb3, lb4);
}
    boolean lb6 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld5, fd0, fd1);
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Output.points[3][7] -= fd1;
    if (fb1) {
        ab1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        } else {
        fd0 = fd1 + fd0;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
}
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
        Thought lo3 = Thought19.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        Thought lo4 = Thought80.getInstance(fb0, fb1, lb1, lb2);
if(fo1 != null){
          ab1 = fo1.m2();
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fb0 = ad1 < ad2;
    double ld0 = 616.4999411507727;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][8] -= ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    Output.points[4][0] += fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought1.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    if (lb2) {
        ad2 = ad3 - ad4;
        fd0 = fd1 - ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
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
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab2 = !ab3;
    boolean lb0 = true;
    Thought lo1 = Thought16.getInstance(ab3, ab4, fb0, fb1);
    ad1 = ad2 - ad3;
    lb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m1();
}
    ab1 = !ab2;
    boolean lb2 = false;
    Output.points[4][1] += fd1;
    ad1 *= -1;
    Output.points[4][2] += ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb1 = lb0 && lb2;
    Thought lo4 = Thought96.getInstance(fo0, fo1, fo0, fo1);
    Output.points[4][3] -= fd1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    lb3 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Output.points[4][4] += fd1;
    Output.points[4][5] += ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
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
      ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    double ld0 = 890.0981247826121;
    Thought lo1 = Thought47.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    boolean lb2 = false;
    lb2 = fd1 > ld0;
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 = ld0 + fd0;
    Thought lo3 = Thought14.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
    double ld4 = 715.4635664710535;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb5 = true;
    fb0 = fb1 && lb2;
    Thought lo6 = Thought1.getInstance(ao2, ao3, ao4, fo0, ld0, ld4, fd0, fd1, lb5, fb0, fb1, lb2);
    boolean lb7 = false;
    boolean lb8 = true;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb5, lb7, lb8, fb0);
}
    fb1 = lb2 && lb5;

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
    fb0 = !fb1;
    boolean lb0 = true;
    double ld1 = 808.382291612435;
if(ao1 != null){
      ld1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2);
}
if(ao2 != null){
      ao2.m2(lb0, fb0, fb1, lb0);
}
    ad3 = ad4 + fd0;
    boolean lb2 = false;
    boolean lb3 = true;
    fd1 = ld1 - ad1;
    Output.points[4][6] += ad2;
    boolean lb4 = false;
    lb2 = !lb3;
    ad3 = ad4 + fd0;
    fd1 = ld1 - ad1;
    boolean lb5 = false;
    Thought lo6 = Thought57.getInstance();
    boolean lb7 = false;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    ab2 = fd1 > fd0;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought5.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab2 = fd0 < fd1;
    if (ab3) {
if(fo1 != null){
          fo1.m3(ab4, fb0, fb1, ab1);
}
        boolean lb1 = false;
        double ld2 = 980.1665311662953;
        ab1 = ab2 && ab3;
        ld2 = fd0 - fd1;
        ld2 = fd0 - fd1;
        Output.points[4][7] += ld2;
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb3 = true;
if(ao3 != null){
          fd0 = ao3.m3(fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ld2 *= -1;
        boolean lb4 = true;
        lb1 = lb3 || lb4;
        ab1 = fd0 > fd1;
        for(int i0=0; i0<10; i0++){
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
    double ld0 = 554.9831179417931;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought1.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    ad4 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(ld0, ad1, ad2, ad3);
}
    Thought lo2 = Thought59.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
    ad1 = ad2 - ad3;
    Thought lo3 = Thought93.getInstance(ab4, fb0, fb1, ab1);
    Thought lo4 = Thought28.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;

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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = lb0 && fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    lb0 = !fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    double ld1 = 459.18771761478246;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    double ld1 = 844.4962829778074;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fd1, ld1, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought29.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
    lb2 = ab1 && ab2;
    fd0 *= -1;
    double ld4 = 408.569974408351;
    boolean lb5 = true;
    double ld6 = 592.2263074656875;
    ld6 = fd0 - fd1;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    Thought lo7 = Thought48.getInstance(ld1, ld4, ld6, fd0);
    lb2 = lb5 || ab1;
    ab2 = ab3 && ab4;
    fd1 *= -1;
    fb0 = ld1 < ld4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld6, fd0, fd1, ld1);
}
    fb1 = lb0 || lb2;
    lb5 = ab1 || ab2;

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
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = ad1 > ad2;
    lb2 = ad3 > ad4;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    fd0 *= -1;
    lb0 = !lb1;
    lb2 = !lb3;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb2 = fd1 < ad1;
        double ld4 = 48.037296742486305;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        lb2 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, lb3, fb0, fb1, lb0);
}
        Output.points[4][8] -= ad4;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, lb3, fb0);
}
        Thought lo5 = Thought69.getInstance(fd1, ld4, ad1, ad2);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb1, lb2);
}
        Thought lo6 = Thought62.getInstance();
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    ab3 = ab4 && fb0;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    boolean lb2 = false;
    ab4 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    double ld3 = 129.1049823074843;
    double ld4 = 196.34122615484858;
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = ad4 > fd0;
    ab4 = fb0 || fb1;
    boolean lb5 = false;

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
    Output.points[5][0] -= fd1;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[5][1] += fd0;
    boolean lb0 = false;
    lb0 = fd1 < fd0;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    lb0 = !fb0;
    fb1 = fd1 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought21.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
        Output.points[5][2] -= fd1;
    double ld2 = 99.10145932927423;
    Output.points[5][3] -= ld2;
if(ao4 != null){
      lb0 = ao4.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;

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
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought4.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
    fd0 = fd1 - ad1;
    boolean lb3 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, lb3, fb0, fb1, lb0);
}
    boolean lb4 = true;
    double ld5 = 185.66649895729404;
if(ao4 != null){
      ao4.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;

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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        lb0 = !ab1;
if(fo1 != null){
          fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
        fb1 = !lb0;
        fd1 = fd0 - fd1;
        ab1 = fd0 > fd1;
if(ao1 != null){
          fd0 = ao1.m3();
}
        Thought lo1 = Thought36.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
        fd1 = fd0 + fd1;
        fb1 = fd0 > fd1;
        lb0 = !ab1;
        fd0 *= -1;
        ab2 = fd1 < fd0;
        ab3 = fd1 > fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 + ad4;
    ab2 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && ab1;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 > ad1;
if(ao2 != null){
      ad2 = ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3();
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought90.getInstance(fo0, fo1, ao1, ao2);
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought38.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld2 = 654.7876756070215;
    double ld3 = 103.6803817246227;
    Thought lo4 = Thought78.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld2);
    Output.points[5][4] += ld3;
    fd0 = fd1 + ld2;
    lb0 = fb0 || fb1;
if(fo1 != null){
      ld3 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    boolean lb5 = true;
    fb0 = !fb1;
    ld2 = ld3 - fd0;
    if (lb0) {
        boolean lb6 = false;
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          lb0 = fo1.m2(fd1, ld2, ld3, fd0, lb5, fb0, fb1, lb6);
}
        fd1 = ld2 - ld3;
        Thought lo7 = Thought6.getInstance(fo0, fo1, fo0, fo1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    fd1 = fd0 - fd1;
    ab3 = !ab4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Output.points[5][5] += fd0;
    double ld0 = 301.2226274628124;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
    ab4 = fd1 > ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;

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
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    double ld0 = 233.6292353191648;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought48.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought30.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        Thought lo3 = Thought82.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought10.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    double ld5 = 401.01348405937097;
        Output.points[5][6] -= ld5;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb6, fb0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ld0);
}
    ld5 *= -1;

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
    ab1 = ab2 || ab3;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld0 = 951.8485915079347;
if(fo1 != null){
      ld0 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      ad1 = fo0.m3();
}
    ad2 = ad3 - ad4;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        boolean lb1 = true;
    ad4 = fd0 - fd1;
    double ld2 = 474.525819673934;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 818.6091885951357;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought20.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
    boolean lb2 = false;
    if (fb0) {
        fb1 = !lb2;
if(ao2 != null){
          ao2.m2(fb0, fb1, lb2, fb0);
}
        boolean lb3 = true;
        fb0 = fb1 || lb3;
if(ao4 != null){
          ao3 = ao4.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    boolean lb0 = true;
    Thought lo1 = Thought80.getInstance(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 *= -1;
        fb0 = fb1 && lb0;
    Thought lo2 = Thought72.getInstance(ao1, ao2, ao3, ao4);
    double ld3 = 127.09220776687216;
    ld3 *= -1;
    ad1 = ad2 - ad3;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3, fb0, fb1, lb0, fb0);
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
    Output.points[5][7] += fd0;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    ab3 = ab4 && fb0;
    fd1 *= -1;
    double ld1 = 681.5420590010597;
    ld1 = fd0 + fd1;
        Thought lo2 = Thought34.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
    ab3 = ab4 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ld1 = fo0.m3(lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 - ld1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought32.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
    boolean lb4 = false;
    ab2 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld1);
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
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    if (ab3) {
        Thought lo0 = Thought49.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
        ab4 = fb0 && fb1;
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
        boolean lb1 = true;
        ab4 = ad3 < ad4;
        fb0 = fd0 < fd1;
        fb1 = ad1 < ad2;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought57.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo2 = Thought18.getInstance(fo1, fo0, fo1, fo0);

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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought24.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    ab1 = !ab2;
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[5][8] += fd1;
    ab2 = fd0 < fd1;
    ab3 = fd0 < fd1;
    Thought lo2 = Thought57.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb1, ab1);
}
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
    ab3 = ab4 || fb0;

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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 292.66682786777324;
    if (fb1) {
        fd0 = fd1 + ld0;
        if (fb0) {
            boolean lb1 = false;
            fb0 = fb1 || lb1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
            lb1 = fd0 > fd1;
if(fo1 != null){
              fo1.m2(ld0, ad1, ad2, ad3);
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
    ad1 *= -1;
    Thought lo0 = Thought34.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought25.getInstance(ab2, ab3, ab4, fb0);
        fd1 *= -1;
        double ld2 = 933.6000623788677;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(ld2, ad1, ad2, ad3, fb0, fb1, lb3, ab1);
}
        Output.points[6][0] -= ad4;
        fd0 *= -1;
        Output.points[6][1] -= fd1;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab3 = !ab4;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb0, fb1, lb3, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(ld2, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
        double ld4 = 982.723835581085;
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
    Thought lo0 = Thought43.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = false;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = lb1 && lb2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
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
    double ld0 = 209.96542892083573;
        Thought lo1 = Thought48.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
    Output.points[6][2] -= ad4;
    fd0 = fd1 - ld0;
    boolean lb2 = false;
    Thought lo3 = Thought52.getInstance(lb2, fb0, fb1, lb2);
    double ld4 = 918.8232179881304;
    Output.points[6][3] += ld4;
    if (fb0) {
        ad1 = ad2 + ad3;
        fb1 = lb2 || fb0;
        double ld5 = 999.7072017553058;
        fb1 = ad3 < ad4;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          ao2.m2(fd0, fd1, ld5, ld0, lb2, fb0, fb1, lb2);
}
        Thought lo6 = Thought93.getInstance(ao3, ao4, fo0, fo1);
        fb0 = fb1 && lb2;
        fb0 = ld4 < ad1;
        Output.points[6][4] += ad2;
        Thought lo7 = Thought58.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
        lb2 = fb0 || fb1;
        double ld8 = 87.13076759335082;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(ld5, ld8, ld0, ld4);
}
        ad1 = ad2 - ad3;
        fb0 = !fb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought71.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    boolean lb1 = false;
    lb1 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
        lb1 = ab1 && ab2;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb2 = false;
    double ld3 = 872.0653504652139;
    Thought lo4 = Thought54.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld3, fd0, lb1, lb2, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    boolean lb5 = false;
    boolean lb6 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld3, fd0, fd1);
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
    Thought lo0 = Thought68.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m1();
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    Thought lo2 = Thought14.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb1);
    Thought lo3 = Thought1.getInstance(fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    Output.points[6][5] -= ad2;
    ab1 = ab2 || ab3;
    double ld4 = 352.2321411322654;
    Thought lo5 = Thought79.getInstance(ab4, fb0, fb1, lb1);
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
if(fo1 != null){
      fo1.m1();
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought93.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought8.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = !lb1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb1, fb0, fb1);
}
    lb1 = fd1 > fd0;
    double ld3 = 346.39780205270125;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
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
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought37.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;

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
