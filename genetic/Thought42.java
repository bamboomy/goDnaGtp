package genetic;
import java.util.ArrayList;
class Thought42 extends Thought{
private static ArrayList<Thought42> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 863.5428525347389;
private double fd1 = 53.97239865342054;
private Thought fo0 = null;
private Thought fo1 = null;
Thought42 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought42 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought42 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought42 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought42 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 597.0718419848143;
    fb0 = !fb1;
    Output.points[0][2] += fd0;
        fb0 = fd1 > ld0;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld1 = 823.2781051656748;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;

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
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m3();
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    double ld2 = 622.1521279408823;
    ld2 *= -1;
    fb0 = fd0 < fd1;
    Thought lo3 = Thought352.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb0, lb1, ab1);
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought369.getInstance(ld2, fd0, fd1, ld2);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    fb1 = lb0 || lb1;
    ab1 = ld2 > fd0;
    double ld5 = 650.7127353354254;

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
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought250.getInstance();
    fb0 = fb1 && fb0;
    double ld1 = 845.9630116480668;
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    fb0 = ld1 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
    ld1 = ad1 + ad2;
    Thought lo3 = Thought137.getInstance(lb2, fb0, fb1, lb2);
    double ld4 = 996.259544905038;
    fb0 = fb1 || lb2;
    fb0 = ad2 < ad3;
    Thought lo5 = Thought199.getInstance(fo1, fo0, fo1, fo0);
    fb1 = lb2 || fb0;
    ad4 = fd0 - fd1;
    boolean lb6 = true;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld4, ad1, ad2, ad3);
}
    double ld7 = 860.7275898971491;
    boolean lb8 = false;
    lb8 = fb0 && fb1;

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
    ab1 = ad2 > ad3;
    double ld0 = 692.781096181479;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought220.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
        if (ab2) {
            ad3 *= -1;
            double ld3 = 490.37309482654825;
            ad3 *= -1;
            ab3 = ab4 || fb0;
            ad4 *= -1;
            boolean lb4 = true;
if(fo0 != null){
              fo0.m1();
}
            fb0 = fb1 && lb4;
            lb1 = fd0 > fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought175.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    double ld1 = 510.5657226902668;
    boolean lb2 = true;
    ld1 = fd0 + fd1;
    double ld3 = 475.5270025987113;
    ld1 *= -1;
    ld3 = fd0 - fd1;
    ld1 = ld3 - fd0;
    fb0 = !fb1;
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(lb2, lb4, fb0, fb1);
}
    lb2 = ld1 < ld3;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = ld1 + ld3;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, ld3);
}
    Output.points[0][3] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, ld3, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ld1, ld3, fd0, fd1, lb4, fb0, fb1, lb2);
}
    lb4 = ld1 > ld3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb4);
}
    fb0 = fb1 || lb2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo5 = Thought366.getInstance(ao3, ao4, fo0, fo1, fd1, ld1, ld3, fd0, lb4, fb0, fb1, lb2);
if(ao2 != null){
      ao1 = ao2.m4(lb4, fb0, fb1, lb2);
}
    double ld6 = 752.6611078752971;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
if(ao1 != null){
      fb1 = ao1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    boolean lb0 = true;
    Output.points[0][4] -= ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought33.getInstance(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
    lb0 = lb1 || fb0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
    fb1 = ad4 < fd0;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = ad4 < fd0;
    boolean lb3 = true;
    lb3 = fb0 && fb1;
    lb0 = lb1 && lb3;
    fb0 = fb1 && lb0;
    lb1 = !lb3;
    fb0 = fd1 > ad1;
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb1, lb3, fb0);
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
    lb0 = fd1 < fd0;
    ab1 = !ab2;
    Output.points[0][5] += fd1;
    fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
    ab4 = !fb0;
    Thought lo1 = Thought243.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
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
      ab1 = ao2.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    fd0 *= -1;
    fd1 *= -1;
    Thought lo1 = Thought59.getInstance(ab4, fb0, fb1, lb0);
    double ld2 = 707.746120283868;
    ab1 = ab2 || ab3;
    double ld3 = 620.1985180463953;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb4 = true;
    Output.points[0][6] += ld3;
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    Output.points[0][7] += ld2;

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
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 855.2188917779326;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd1 *= -1;
    Thought lo2 = Thought79.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    fb0 = ld0 > fd0;
    fb1 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb1, lb3);
}
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb1;
    double ld4 = 333.64787579025807;
if(fo0 != null){
      fo0.m1(ld4, fd0, fd1, ld0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = !ab1;
    fd1 *= -1;
    Output.points[0][8] += fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought134.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, lb2, ab1);
    ab2 = !ab3;

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
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Thought lo0 = Thought163.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought285.getInstance();
    fb0 = fd0 < fd1;
    double ld2 = 409.2881383018083;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fb1 = fd1 < ld2;
    double ld3 = 893.0318522257098;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3);
}
    boolean lb4 = true;
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld2, lb4, fb0, fb1, lb4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb4, fb0);
}
if(fo1 != null){
      ld3 = fo1.m3();
}
    Thought lo5 = Thought162.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb4, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(lb4, fb0, fb1, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    Thought lo0 = Thought16.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ad2 = ad3 - ad4;
    ab2 = fd0 > fd1;
    Output.points[1][0] -= ad1;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    ad2 = ad3 + ad4;
    double ld1 = 740.3369804218224;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ad4 > fd0;

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
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    Output.points[1][1] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;

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
    fb0 = ad2 > ad3;
    boolean lb0 = false;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ad2 < ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || fb0;
        double ld1 = 322.599201108174;
        fb1 = ad2 > ad3;
        lb0 = fb0 && fb1;
if(ao3 != null){
          ao3.m3(ad4, fd0, fd1, ld1);
}
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        Thought lo2 = Thought183.getInstance(fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
        boolean lb3 = false;
        ad4 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, fb0, fb1, lb3, lb0);
}
        Output.points[1][2] -= ad4;
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
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
        ab4 = fd1 > fd0;
        fb0 = fb1 || lb1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        Output.points[1][3] -= fd1;
        lb0 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb2 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb2);
}
        lb0 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 = fd0 - fd1;
        double ld3 = 746.596034924376;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m2(fb0, fb1, lb1, lb2);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        lb0 = ab1 && ab2;
        ab3 = !ab4;
        fd0 = fd1 - ld3;
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
        ab2 = !ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m3(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    ab3 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought163.getInstance(fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo3 = Thought0.getInstance(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);

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
    Thought lo0 = Thought305.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    double ld2 = 985.7949476728962;
    double ld3 = 303.41116055141;
    boolean lb4 = false;
    Thought lo5 = Thought249.getInstance();
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld2, lb1, lb4, fb0, fb1);
}
    ld3 = fd0 + fd1;
    Thought lo6 = Thought78.getInstance(lb1, lb4, fb0, fb1);
    ld2 *= -1;
    Output.points[1][4] += ld3;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, fd0, fd1);
}
    Thought lo7 = Thought45.getInstance(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
if(fo1 != null){
      ld2 = fo1.m3(ld3, fd0, fd1, ld2, lb4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb1);
}
    ld3 = fd0 - fd1;

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
        boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd1 = fo0.m3(fb0, fb1, lb0, ab1);
}
        Thought lo1 = Thought374.getInstance(fo1, fo0, fo1, fo0);
        if (ab2) {
            fd0 = fd1 + fd0;
            Output.points[1][5] += fd1;
            } else {
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought58.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    double ld1 = 141.50807163780217;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Output.points[1][6] -= ad3;
    boolean lb2 = false;
    fb0 = ad4 > fd0;
    fb1 = lb2 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, fb0, fb1, lb2, fb0);
}
    double ld3 = 691.3631363001193;
if(fo1 != null){
      fo1.m1(fb1, lb2, fb0, fb1);
}
    lb2 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld1);
}
    fb0 = ld3 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld4 = 219.35807072996985;
    boolean lb5 = false;
    fb0 = !fb1;
    fd0 = fd1 + ld1;
    ld3 *= -1;
    lb2 = !lb5;
    ld4 *= -1;

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
    boolean lb0 = false;
    lb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = lb1 || ab1;
        ad4 = fd0 - fd1;
    ab2 = ab3 || ab4;
    ad1 *= -1;

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
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought371.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        double ld1 = 947.4774402029927;
        fb0 = fd0 > fd1;
        fb1 = fb0 && fb1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        fb0 = !fb1;
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
    double ld0 = 177.94051126716934;
    fb0 = ad1 > ad2;
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    double ld1 = 355.14764183504883;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    fb1 = fb0 && fb1;
    fb0 = ld1 < ad1;
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = ld1 < ad1;
        fb1 = ad2 < ad3;
if(ao3 != null){
          ao3.m1();
}
        boolean lb3 = true;
        Thought lo4 = Thought174.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, lb3, lb2, fb0, fb1);
        ld1 *= -1;
        double ld5 = 328.62401006690266;
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
    Output.points[1][7] -= fd1;
    fd0 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[1][8] += fd1;
    Output.points[2][0] -= fd0;
    boolean lb0 = true;
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || ab1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
    Thought lo1 = Thought200.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 *= -1;
    fd1 *= -1;
    lb0 = !ab1;

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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ab1 = ad2 > ad3;
    ab2 = ad4 < fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[2][1] += fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 297.590587847511;
    Output.points[2][2] += fd0;
    fd1 *= -1;
    ld0 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
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
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld0 = 200.0841004136139;
    ab1 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
if(fo1 != null){
          fo1.m1(ld0, fd0, fd1, ld0);
}
        Thought lo2 = Thought170.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
        Thought lo3 = Thought230.getInstance(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
        ld0 = fd0 + fd1;
        ld0 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
        ld0 = fd0 + fd1;
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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought244.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    double ld1 = 819.142066888774;
    Output.points[2][3] -= ad1;
    ad2 = ad3 + ad4;
    fb1 = fb0 && fb1;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought210.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad2 < ad3;

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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    double ld1 = 709.1807177113328;
    ab1 = !ab2;
    ab3 = !ab4;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought168.getInstance(ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    Thought lo4 = Thought292.getInstance(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 - ld1;
    fb0 = !fb1;
    boolean lb5 = false;

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
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought36.getInstance();
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought86.getInstance(fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    double ld2 = 433.812036266755;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought254.getInstance(ld2, fd0, fd1, ld2);
    boolean lb4 = false;
    fb0 = fb1 && lb4;
    boolean lb5 = true;
    fd0 *= -1;
    Thought lo6 = Thought359.getInstance(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
    lb5 = !fb0;
    fb1 = ld2 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ld2, fd0, fd1, ld2, lb4, lb5, fb0, fb1);
}
    fd0 = fd1 + ld2;
    Thought lo7 = Thought375.getInstance(ao4, fo0, fo1, ao1, lb4, lb5, fb0, fb1);
    boolean lb8 = false;
if(ao2 != null){
      fd0 = ao2.m3();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    if (fb0) {
        boolean lb0 = false;
        double ld1 = 867.8475931049193;
if(ao1 != null){
          ao1.m3(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad1 *= -1;
        fb1 = !lb0;
        ad2 = ad3 - ad4;
        boolean lb2 = false;
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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought36.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
    fd0 = fd1 - fd0;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1();
}
    Thought lo2 = Thought384.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
    ab1 = ab2 || ab3;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb1);
}
    boolean lb3 = true;
    Output.points[2][4] -= fd1;
    boolean lb4 = true;
    fd0 = fd1 + fd0;

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
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[2][5] += fd1;
        ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought345.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
    Output.points[2][6] -= ad4;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld1 = 926.8913193718482;
    Thought lo2 = Thought127.getInstance();
    Output.points[2][7] += ad2;
    ad3 *= -1;

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
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
    Thought lo1 = Thought75.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = true;
    fd1 = fd0 - fd1;

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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought28.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    double ld3 = 155.14637472954408;
    double ld4 = 975.5194836534049;
    Thought lo5 = Thought318.getInstance();
    fb0 = fb1 && lb1;
    lb2 = ld3 > ld4;
    fb0 = fb1 && lb1;
    Thought lo6 = Thought291.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld4, lb2, fb0, fb1, lb1);
    fd0 = fd1 + ld3;
    lb2 = !fb0;
    fb1 = ld4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld7 = 105.74786730691724;
if(fo1 != null){
      fo1.m3(ld4, ld7, fd0, fd1);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, ld4, ld7, fd0, fd1);
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
    fb0 = fd0 < fd1;
    fb1 = !fb0;
        boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    lb0 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    lb1 = lb2 && fb0;

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
