package genetic;
import java.util.ArrayList;
class Thought7 extends Thought{
private static ArrayList<Thought7> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 398.3880202975326;
private double fd1 = 974.3283081849181;
private Thought fo0 = null;
private Thought fo1 = null;
Thought7 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought7 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought7 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought7 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought7 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought7 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought7 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought7 instance = new Thought7 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Output.points[7][6] += fd0;
    double ld0 = 459.92034936541506;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought276.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fd1 < ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    Thought lo2 = Thought159.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0);
}
    boolean lb3 = true;
    Thought lo4 = Thought271.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
    double ld5 = 512.8954261442248;
if(fo1 != null){
      fo1.m2(ld0, ld5, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 && fb0;
    fb1 = !lb3;
    boolean lb6 = false;
    double ld7 = 136.34177446709754;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, lb6, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][7] -= ld5;
    lb6 = !fb0;

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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    Output.points[7][8] += fd1;
    ab1 = !ab2;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    boolean lb2 = false;
    Thought lo3 = Thought177.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought309.getInstance(fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        lb2 = ab1 && ab2;
        Output.points[8][0] -= fd0;
        fd1 *= -1;
        ab3 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        double ld5 = 553.6973490190154;
        ab4 = ld5 < fd0;
        Output.points[8][1] -= fd1;
        fb0 = fb1 && lb0;
        ld5 *= -1;
        Thought lo6 = Thought196.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld5, fd0);
if(fo1 != null){
          fo1.m3(fd1, ld5, fd0, fd1, lb1, lb2, ab1, ab2);
}
        boolean lb7 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
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
    fb0 = !fb1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought39.getInstance();
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[8][2] += fd0;
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ad1;
    Output.points[8][3] -= ad2;

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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ad4 = fd0 + fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3();
}
    ab1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
        boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought163.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb2 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
    lb0 = lb1 && lb2;
    ab1 = !ab2;

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 41.86745450686723;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld0;
    fd0 *= -1;
    fb0 = fd1 > ld0;
    fd0 = fd1 - ld0;
    if (fb1) {
if(ao2 != null){
          fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
        double ld1 = 498.77626570296525;
        double ld2 = 37.04976032296903;
        double ld3 = 546.6472988309088;
        Output.points[8][4] -= ld2;
        Output.points[8][5] -= ld3;
        Thought lo4 = Thought67.getInstance(ao3, ao4, fo0, fo1);
        ld0 = fd0 + fd1;
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
      fb1 = ao1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought186.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    Output.points[8][6] += ad2;
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    Output.points[8][7] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          lb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    Output.points[8][8] += ad3;
    boolean lb3 = false;

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
      ab2 = ao2.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ab3 = ab4 || fb0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought311.getInstance();
    fb1 = fd1 > fd0;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought316.getInstance(ab4, fb0, fb1, lb0);
    Thought lo4 = Thought253.getInstance(ao1, ao2, ao3, ao4);
    Thought lo5 = Thought367.getInstance(fd1, fd0, fd1, fd0);
    lb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fd1 *= -1;
    fb1 = fd0 < fd1;

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
    ab1 = ab2 && ab3;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    Output.points[0][0] += ad1;

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
    boolean lb0 = false;
    Output.points[0][1] += fd1;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought17.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 - fd1;
    double ld3 = 270.4652676836755;
    ld3 = fd0 + fd1;
    boolean lb4 = false;
    boolean lb5 = false;
    boolean lb6 = true;

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
      ab2 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    Thought lo0 = Thought2.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
        } else {
                ab4 = fb0 || fb1;
        ab1 = ab2 && ab3;
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
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld1 = 996.1205987447589;

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
    ab1 = ad1 < ad2;
    ab2 = ad3 > ad4;
    double ld0 = 980.6106929527696;
    ab3 = ab4 || fb0;
    Output.points[0][2] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo1 = Thought290.getInstance();
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought317.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    double ld3 = 228.7244118174406;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ld3 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ab1 && ab2;
    ab3 = ad3 < ad4;
    fd0 = fd1 + ld0;
        ab4 = ld3 > ad1;

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
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    boolean lb1 = true;
    Thought lo2 = Thought104.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    lb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    Thought lo3 = Thought135.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, lb1, fb0);
    Thought lo4 = Thought13.getInstance();
    fd1 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb1 = ao3.m2(lb0, lb1, fb0, fb1);
}
    Output.points[0][3] += fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[0][4] -= fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao1 != null){
          fb1 = ao1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
    ad3 *= -1;
if(ao3 != null){
      ad4 = ao3.m3();
}
    fd0 = fd1 + ad1;
    lb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
    ad3 *= -1;
    double ld2 = 98.87886421091841;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo0 = Thought276.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[0][5] += fd1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo2 = Thought63.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    lb1 = ab1 && ab2;
    boolean lb3 = false;
    Output.points[0][6] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb5 = false;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
}
    lb4 = fd0 > fd1;
    double ld6 = 292.05298510907505;
    lb5 = ld6 < fd0;
    ab1 = ab2 && ab3;
    ab4 = fd1 > ld6;

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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
    ab3 = ad3 < ad4;
    ab4 = fd0 < fd1;
    Output.points[0][7] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    ab1 = ad1 < ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;

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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought187.getInstance();
    fb1 = lb0 && fb0;
    Thought lo2 = Thought56.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    boolean lb3 = false;
    if (lb0) {
if(fo0 != null){
          fd1 = fo0.m3(lb3, fb0, fb1, lb0);
}
        Thought lo4 = Thought63.getInstance(fo1, fo0, fo1, fo0);
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0);
}
        lb3 = !fb0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb3, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb3, fb0, fb1);
}
        lb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fd1 *= -1;
        lb3 = fd0 < fd1;
        fb0 = !fb1;
        fd0 = fd1 - fd0;
        lb0 = !lb3;
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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
    Thought lo0 = Thought205.getInstance();
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab2 = !ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought235.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab3 = ab4 || fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
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
    fb0 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[0][8] += ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo0 != null){
          ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
if(fo0 != null){
          fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fb1 = fb0 && fb1;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
            fb0 = !fb1;
            fb0 = !fb1;
            fb0 = fb1 && fb0;
            }
        fb1 = ad4 < fd0;
        for(int i2=0; i2<10; i2++){
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
              ad1 = fo1.m3();
}
            Thought lo0 = Thought373.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
            boolean lb1 = true;
if(fo0 != null){
              fo0.m1(lb1, fb0, fb1, lb1);
}
            fd1 = ad1 + ad2;
            ad3 = ad4 + fd0;
            Thought lo2 = Thought183.getInstance(fo1, fo0, fo1, fo0);
            Thought lo3 = Thought335.getInstance(fd1, ad1, ad2, ad3);
}}
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
    boolean lb0 = true;
    boolean lb1 = true;
    lb1 = ad1 < ad2;
    Thought lo2 = Thought155.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    boolean lb3 = true;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb3, lb4, ab1, ab2);
}
    fd0 = fd1 + ad1;
    double ld5 = 507.3870341978842;
    ab3 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    Thought lo6 = Thought280.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld5, ad1, lb1, lb3, lb4, ab1);
    ab2 = ab3 && ab4;
    boolean lb7 = false;
    ab4 = fb0 && fb1;

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
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    if (fb0) {
        fb1 = fb0 || fb1;
        Output.points[1][0] += fd1;
        fb0 = fb1 || fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        double ld0 = 259.7209724906375;
if(ao4 != null){
          ao3 = ao4.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        Output.points[1][1] -= fd0;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(ao4 != null){
          ao4.m2();
}
        } else {
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > fd0;
if(ao4 != null){
          ao4.m1(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb1 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
              ao1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
            fb0 = fd1 < fd0;
}}
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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    Output.points[1][2] += ad1;
    Output.points[1][3] += ad2;
if(ao2 != null){
      ao2.m3();
}
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = ad4 > fd0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
    double ld1 = 723.8706659846279;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ld1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Output.points[1][4] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 > fd1;
        fb1 = ab1 && ab2;
        boolean lb0 = false;
        boolean lb1 = true;
        ab1 = ab2 && ab3;
if(ao1 != null){
          ao1.m2(ab4, fb0, fb1, lb0);
}
        boolean lb2 = false;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        boolean lb3 = false;
        }
    fd0 = fd1 + fd0;
    boolean lb4 = true;
    fd1 *= -1;
    boolean lb5 = false;
if(ao1 != null){
      lb5 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    fd1 = fd0 - fd1;
        fd0 *= -1;
        ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb4, lb5);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    boolean lb0 = false;
    lb0 = ab1 && ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = !lb1;
    boolean lb2 = false;
    ad1 = ad2 + ad3;
    lb2 = !ab1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ad4 = ao2.m3();
}
    fd0 = fd1 + ad1;
    fb0 = fb1 || lb0;
    boolean lb3 = false;
    ad2 = ad3 - ad4;
    Output.points[1][5] += fd0;
    lb1 = lb2 || lb3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Output.points[1][6] -= ad4;
    fb0 = fd0 > fd1;
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao3.m1(lb0, lb1, lb2, lb3);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
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
        boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought397.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    lb0 = lb1 || fb0;
        fb1 = lb0 && lb1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Thought lo3 = Thought259.getInstance(lb0, lb1, fb0, fb1);
        fd0 = fd1 - fd0;
    lb0 = fd1 < fd0;
    Thought lo4 = Thought128.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    lb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;

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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought206.getInstance();
    double ld1 = 108.90539682933219;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
    double ld2 = 628.3959073303918;
    fd0 = fd1 + ld1;
    double ld3 = 987.6898013921922;

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
    fb0 = ad2 > ad3;
    boolean lb0 = false;
    fb0 = !fb1;
    boolean lb1 = false;
    double ld2 = 831.6841233201405;
    Thought lo3 = Thought369.getInstance(lb0, lb1, fb0, fb1);
    Thought lo4 = Thought391.getInstance(fo0, fo1, fo0, fo1);
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ad1, ad2);
}
    ad3 = ad4 - fd0;
    lb0 = !lb1;
    boolean lb5 = false;
    lb5 = fd1 < ld2;
    boolean lb6 = false;
    double ld7 = 59.400988172307116;
    Thought lo8 = Thought342.getInstance(fo0, fo1, fo0, fo1, ld7, ad1, ad2, ad3);
    lb6 = ad4 > fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(ld2, ld7, ad1, ad2, lb1, lb5, lb6, fb0);
}
    ad3 = ad4 - fd0;
    fd1 = ld2 - ld7;
    Output.points[1][7] += ad1;
    boolean lb9 = true;
    double ld10 = 732.7923670384926;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb5, lb6, lb9);
}
if(fo1 != null){
      fo1.m1();
}
    fb0 = !fb1;

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
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought337.getInstance(ab3, ab4, fb0, fb1);
    Thought lo1 = Thought260.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3);
}
    ab1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ab2 = !ab3;
    ad4 = fd0 + fd1;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[1][8] += fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[2][0] -= fd1;
    Output.points[2][1] -= fd0;
    boolean lb0 = true;

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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    Output.points[2][2] -= fd1;
    fb0 = !fb1;
    fb0 = ad1 > ad2;
    Thought lo0 = Thought356.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 697.0266888889989;
    Thought lo2 = Thought362.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ld1 > ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 *= -1;
    Thought lo3 = Thought207.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld4 = 468.2679865690292;
if(ao1 != null){
      ad2 = ao1.m3();
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
    boolean lb0 = false;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld1 = 958.535814389735;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    ld1 *= -1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb2);
}
    ab1 = fd0 > fd1;
    ld1 *= -1;

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
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
        }
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    Thought lo0 = Thought105.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
    double ld1 = 744.0826978149047;
    boolean lb2 = false;
    Thought lo3 = Thought180.getInstance();
    lb2 = !ab1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[2][3] -= ld1;
    fb1 = !lb2;
if(ao4 != null){
      ad1 = ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    ad2 *= -1;
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && lb2;
    ab1 = !ab2;
    Thought lo4 = Thought365.getInstance(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3);
    boolean lb5 = true;
    ad4 = fd0 + fd1;
    Thought lo6 = Thought102.getInstance(ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    ad4 = fd0 - fd1;

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
    fd0 = fd1 + fd0;
    Output.points[2][4] += fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought100.getInstance();
    Thought lo1 = Thought281.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld2 = 480.6760378291185;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
            Thought lo3 = Thought76.getInstance(ld2, fd0, fd1, ld2);
    fd0 = fd1 - ld2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
        Thought lo4 = Thought222.getInstance(fd1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = ld2 < fd0;
    fd1 = ld2 - fd0;
    boolean lb5 = false;
    boolean lb6 = true;
    Output.points[2][5] += fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb6, fb0, fb1, lb5);
}
if(fo1 != null){
      lb6 = fo1.m2();
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
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    lb1 = !fb0;
    fb1 = !lb0;
    lb1 = !fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[2][6] -= fd0;
    Output.points[2][7] += fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fb1 = !lb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld0 = 885.3286577377248;
        Thought lo1 = Thought205.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought139.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
    fd1 *= -1;
    Output.points[2][8] += ld0;
        boolean lb4 = false;
    boolean lb5 = false;
    Thought lo6 = Thought5.getInstance();
    lb5 = fb0 || fb1;
    double ld7 = 614.8669162374658;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld7, fd0, fd1, ld0, lb3, lb4, lb5, fb0);
}
    boolean lb8 = false;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb3, lb4);
}
    double ld9 = 948.97474962438;

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
