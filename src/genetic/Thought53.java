package genetic;
import java.util.ArrayList;
class Thought53 extends Thought{
private static ArrayList<Thought53> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 449.95432740702455;
private double fd1 = 389.87086403975087;
private Thought fo0 = null;
private Thought fo1 = null;
Thought53 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought53 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought53 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought53 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought53 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought5.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2();
}
    double ld1 = 826.3401152026115;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    double ld2 = 278.15732490438535;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = ld2 > fd0;
        fb1 = fb0 && fb1;
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
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    boolean lb0 = true;
    boolean lb1 = false;
    double ld2 = 999.0603940272803;
    Thought lo3 = Thought75.getInstance(fd0, fd1, ld2, fd0);
    fd1 = ld2 + fd0;
    ab1 = ab2 && ab3;
    boolean lb4 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    boolean lb5 = false;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3();
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
    Output.points[6][0] += ad2;
    fb0 = !fb1;
    ad3 = ad4 + fd0;
    boolean lb3 = false;
    lb0 = !lb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;
    Thought lo5 = Thought28.getInstance(lb2, lb3, lb4, fb0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
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
    ab1 = !ab2;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (ab1) {
        fd1 = ad1 - ad2;
        Output.points[6][1] -= ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        ab3 = ad2 > ad3;
        double ld0 = 518.356872508235;
        double ld1 = 630.9922714026461;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = ab1 && ab2;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        Output.points[6][2] -= fd1;
        Output.points[6][3] -= ld0;
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
    Output.points[6][4] += fd0;
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    Output.points[6][5] += fd1;
    fd0 *= -1;
    Thought lo0 = Thought53.getInstance();
    fb0 = fb1 && fb0;
    Output.points[6][6] -= fd1;
    Thought lo1 = Thought96.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = true;
    fd0 *= -1;
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    double ld1 = 844.5458751695836;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld1);
}
    fb1 = lb0 || fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    if (fb1) {
        } else {
        lb0 = fd0 > fd1;
        boolean lb2 = true;
        lb0 = fb0 || fb1;
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
    ab1 = fd0 < fd1;
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    boolean lb0 = false;
    fd0 *= -1;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo2 = Thought51.getInstance();
    fb1 = lb0 || lb1;
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
if(ao3 != null){
          ao3.m3(fd1, fd0, fd1, fd0, lb1, lb3, ab1, ab2);
}
        Thought lo5 = Thought60.getInstance(ao4, fo0, fo1, ao1);
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
    double ld0 = 834.1396563947301;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
        ab3 = ld0 > ad1;
        Thought lo1 = Thought68.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
          ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
        fd1 = ld0 + ad1;
        ab3 = ad2 < ad3;
        Output.points[6][7] -= ad4;
        ab4 = fd0 > fd1;
        double ld2 = 159.74855155918075;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ao3.m2(ld2, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
        ab3 = ad3 > ad4;
        ab4 = fd0 > fd1;
        Output.points[6][8] -= ld2;
        Thought lo3 = Thought48.getInstance(ao4, fo0, fo1, ao1);
        ld0 *= -1;
        fb0 = !fb1;
        Output.points[7][0] += ad1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        double ld4 = 792.3174790545422;
        Thought lo5 = Thought63.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
        ab3 = ab4 || fb0;
        fd0 *= -1;
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
    boolean lb0 = false;
    Output.points[7][1] -= fd1;
    fd0 = fd1 + fd0;
    double ld1 = 137.23130496822188;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought23.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
    fb1 = ld1 > fd0;
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought60.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo4 = Thought17.getInstance(fo0, fo1, fo0, fo1);
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    Thought lo5 = Thought31.getInstance(fb1, lb0, fb0, fb1);
    Thought lo6 = Thought84.getInstance();
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb7 = true;
    lb7 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb8 = false;
    lb0 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb7, lb8, fb0, fb1);
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    fb0 = fd0 > fd1;
    Output.points[7][2] += fd0;
    fb1 = ab1 && ab2;
    Thought lo0 = Thought89.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    boolean lb1 = false;
    lb1 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
        boolean lb2 = false;
    fd1 = fd0 - fd1;
    boolean lb3 = false;
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb1;
    lb2 = lb3 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    double ld0 = 61.39451926393962;
        double ld1 = 948.3988977692501;
    Output.points[7][3] -= ld1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld1);
}
    fb0 = ad1 < ad2;
    fb1 = !lb2;
    boolean lb4 = true;
    Output.points[7][4] -= ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    lb3 = ad1 > ad2;
    boolean lb5 = true;
    lb4 = !lb5;
    ad3 = ad4 - fd0;
    double ld6 = 193.4486478354425;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, lb3, lb4);
}
    lb5 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb7 = false;
    Output.points[7][5] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, ld6, ad1, lb2, lb3, lb4, lb5);
}
    lb7 = fb0 && fb1;

Thought.STACK_COUNTER++;
return lb2;
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
    double ld0 = 353.4062208097056;
    ab2 = ab3 || ab4;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad1 *= -1;
    fb0 = !fb1;
    boolean lb1 = false;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fd1 = ld0 - ad1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[7][6] += fd1;
        ld0 = ad1 + ad2;
    Thought lo2 = Thought66.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    double ld3 = 727.8758744674134;

Thought.STACK_COUNTER++;
return ab2;
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
    fd0 *= -1;
    fb1 = fd1 > fd0;
    Thought lo0 = Thought7.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
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
    fb1 = ad1 < ad2;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 733.4152415511592;
    if (fb1) {
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        ld0 = ad1 - ad2;
        if (fb1) {
if(fo1 != null){
              fo1.m1(ad3, ad4, fd0, fd1);
}
            boolean lb1 = false;
            Thought lo2 = Thought97.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
            double ld3 = 899.6121257086123;
            Output.points[7][7] -= ad3;
            boolean lb4 = true;
            lb1 = !lb4;
            fb0 = ad4 > fd0;
if(fo1 != null){
              fo0 = fo1.m4(fb1, lb1, lb4, fb0);
}
            fb1 = fd1 > ld3;
            lb1 = ld0 > ad1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    double ld1 = 121.30718824190924;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = true;
        lb2 = lb3 || lb4;
    ld1 = fd0 + fd1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
}
    boolean lb5 = true;
    boolean lb6 = true;

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2();
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ad3 = ad4 - fd0;
    ab1 = fd1 < ad1;
    ab2 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    Thought lo1 = Thought4.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    fd1 *= -1;
    lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    ab3 = ad4 > fd0;
    Thought lo2 = Thought42.getInstance(fd1, ad1, ad2, ad3);
    Thought lo3 = Thought61.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
    Thought lo4 = Thought8.getInstance(ab4, fb0, fb1, lb0);
    ab1 = ab2 && ab3;
    Thought lo5 = Thought89.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 < ad1;
    ab2 = ad2 < ad3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
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
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Output.points[7][8] -= fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought20.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    boolean lb2 = false;
    fb0 = fd1 < fd0;
    fb1 = lb0 || lb2;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb2);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought91.getInstance();
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    Output.points[8][0] += fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
    double ld2 = 579.4518627709514;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][1] += ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    Thought lo0 = Thought59.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[8][2] += fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
    ad4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    Output.points[8][3] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        }
    fb0 = fb1 && fb0;

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
    ab2 = !ab3;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo1.m1();
}
    Thought lo3 = Thought88.getInstance(ad4, fd0, fd1, ad1, lb1, lb2, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[8][4] -= ad2;
    Thought lo4 = Thought64.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    lb0 = lb1 && lb2;
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    boolean lb5 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fd0 > fd1;
    Output.points[8][5] -= fd0;
if(ao3 != null){
      ao3.m2();
}
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    double ld1 = 263.9357026161911;
    fb0 = fb1 && lb0;
    fb0 = fd0 < fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 731.795171538092;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    lb1 = ld0 < ad1;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
    fd1 = ld0 - ad1;
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
    ad2 *= -1;
    ad3 *= -1;
    lb2 = lb3 || lb4;
    ad4 = fd0 + fd1;
    boolean lb5 = false;
    boolean lb6 = true;
    lb5 = lb6 || fb0;
    boolean lb7 = false;
    boolean lb8 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb8, fb0, fb1, lb1);
}
    ld0 *= -1;
    lb2 = ad1 < ad2;
    lb3 = lb4 && lb5;
    ad3 = ad4 + fd0;

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
if(ao2 != null){
      ab2 = ao2.m2();
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab2 = !ab3;
    fd0 *= -1;
    Output.points[8][6] -= fd1;
    double ld0 = 247.38990466924943;
    if (ab4) {
        fb0 = ld0 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][7] -= ad1;
    double ld0 = 640.7127805994729;
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao4 != null){
      ad3 = ao4.m3();
}
    ab3 = ad4 < fd0;
    fd1 = ld0 + ad1;
    ab4 = ad2 > ad3;
    double ld1 = 850.2386542712496;
    double ld2 = 894.4500205953985;
    boolean lb3 = true;
    double ld4 = 399.77375108945233;
    boolean lb5 = false;
    ad1 = ad2 + ad3;
    ab3 = ab4 || fb0;
    ad4 = fd0 + fd1;
    double ld6 = 841.1283365403135;
    Output.points[8][8] -= ld0;
    ld1 *= -1;
if(fo0 != null){
      ld2 = fo0.m3(ld4, ld6, ad1, ad2, fb1, lb3, lb5, ab1);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ld1 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[0][0] += fd0;
    fb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2(fb1, fb0, fb1, fb0);
}
        fd0 *= -1;
        fb1 = fd1 > fd0;
if(fo0 != null){
          fo0.m2();
}
        fb0 = fb1 || fb0;
        }
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 614.8321570966643;
    fb1 = ld0 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
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
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab3 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    ab4 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    lb0 = lb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
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
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    lb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = ad3 < ad4;
    boolean lb2 = true;
    fd0 = fd1 - ad1;
    double ld3 = 379.2787542833104;
    ad1 = ad2 - ad3;
    lb2 = fb0 || fb1;
    ad4 = fd0 + fd1;
    double ld4 = 920.8225586367176;
    boolean lb5 = false;
    ld3 = ld4 - ad1;
if(fo1 != null){
      lb0 = fo1.m2(ad2, ad3, ad4, fd0);
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
    Output.points[0][1] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    double ld0 = 609.3135226789118;
    ab2 = !ab3;
    boolean lb1 = true;
    ab3 = ad1 < ad2;
    ab4 = !fb0;
    fb1 = ad3 > ad4;
        fd0 *= -1;
    Thought lo2 = Thought69.getInstance(lb1, ab1, ab2, ab3);
    double ld3 = 111.3994237853639;
    fd0 = fd1 - ld0;
    ab4 = ld3 > ad1;
if(fo1 != null){
      fo1.m3();
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
    ld0 = ld3 + ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[0][2] -= ad1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - ld3;

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
    Thought lo0 = Thought40.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 239.55877869688007;
        fb1 = ld1 < fd0;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
    double ld2 = 79.99767568776508;
    if (fb1) {
        boolean lb3 = true;
        boolean lb4 = false;
if(ao1 != null){
          fo1 = ao1.m4(lb3, lb4, fb0, fb1);
}
        boolean lb5 = false;
        lb3 = lb4 && lb5;
        ld2 = fd0 - fd1;
        boolean lb6 = false;
        lb6 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ld1 = ao4.m3(ld2, fd0, fd1, ld1, lb3, lb4, lb5, lb6);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
        fb0 = ld2 < fd0;
        fb1 = !lb3;
        double ld7 = 612.0915661863974;
        fd0 *= -1;
        Output.points[0][3] += fd1;
        Thought lo8 = Thought76.getInstance(ao4, fo0, fo1, ao1, ld7, ld1, ld2, fd0, lb4, lb5, lb6, fb0);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb3, lb4, lb5);
}
        lb6 = !fb0;
if(ao2 != null){
          ao2.m1(fd1, ld7, ld1, ld2);
}
        Thought lo9 = Thought51.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld7, ld1);
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
    Thought lo0 = Thought42.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad1 > ad2;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      fb1 = ao3.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            Thought lo1 = Thought34.getInstance(ad2, ad3, ad4, fd0);
            fb0 = fd1 < ad1;
            fb1 = ad2 > ad3;
            fb0 = fb1 || fb0;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
            ad2 = ad3 + ad4;
if(ao2 != null){
              ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
              ao3.m1();
}
if(ao4 != null){
              fd0 = ao4.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
            Output.points[0][4] += ad4;
            boolean lb2 = true;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought91.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 *= -1;
    boolean lb1 = true;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, ab1);
}
    fd1 = fd0 + fd1;
    double ld2 = 50.356439118977725;
    ld2 *= -1;
    ab2 = fd0 < fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
if(ao2 != null){
      ab3 = ao2.m2(ad3, ad4, fd0, fd1);
}
    double ld0 = 249.1123933577085;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
    ab3 = ad4 > fd0;
    double ld2 = 932.5520591298305;
    Output.points[0][5] -= fd0;
    boolean lb3 = true;
    boolean lb4 = true;

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
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
    double ld0 = 701.9208651695724;
    Output.points[0][6] -= fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ld0 < fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ld0 = fd0 + fd1;
    fb0 = ld0 > fd0;
    double ld2 = 941.3187807210596;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    ld0 = ld2 + fd0;
    Thought lo3 = Thought41.getInstance(fd1, ld0, ld2, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
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
    boolean lb0 = false;
    lb0 = !fb0;
    Thought lo1 = Thought65.getInstance(fb1, lb0, fb0, fb1);
    Thought lo2 = Thought46.getInstance();
    boolean lb3 = true;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
    lb3 = fb0 || fb1;
    fd1 = fd0 - fd1;
    Thought lo4 = Thought35.getInstance(fo0, fo1, fo0, fo1);
        boolean lb5 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, lb5, fb0, fb1);
}
    double ld6 = 596.7743043490766;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb3, lb5, fb0);
}
    Output.points[0][7] += fd0;
    Thought lo7 = Thought50.getInstance(fd1, ld6, fd0, fd1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld6, fd0, fd1, ld6);
}
    fb1 = lb0 || lb3;
    boolean lb8 = false;
if(fo0 != null){
      fo0.m3(lb5, lb8, fb0, fb1);
}
        Thought lo9 = Thought55.getInstance();
if(fo1 != null){
      fo1.m1(fd0, fd1, ld6, fd0, lb0, lb3, lb5, lb8);
}
    fd1 = ld6 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
        fb0 = fd1 < fd0;
    Thought lo1 = Thought22.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fb1 = !lb0;
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
        fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo2 = Thought35.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fb0 = fb1 && lb0;
    Output.points[0][8] += fd1;

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
