package genetic;
import java.util.ArrayList;
class Thought12 extends Thought{
private static ArrayList<Thought12> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 81.08602220968703;
private double fd1 = 185.2475965625491;
private Thought fo0 = null;
private Thought fo1 = null;
Thought12 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought12 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought12 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought12 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought12 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought12 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought12 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought12 instance = new Thought12 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
    double ld0 = 858.4910509801111;
    double ld1 = 831.5826707080492;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    fb0 = ld0 < ld1;
    fb1 = fd0 < fd1;
        ld0 = ld1 - fd0;
    Output.points[8][0] += fd1;
    double ld2 = 862.6373622737111;
if(fo0 != null){
      ld0 = fo0.m3(ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    double ld0 = 52.85115485365218;
    Output.points[8][1] -= fd0;
    ab4 = !fb0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
    Output.points[8][2] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      ld0 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    lb1 = ab1 || ab2;
    Output.points[8][3] -= fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    lb1 = lb2 && ab1;
    ab2 = ab3 || ab4;

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
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    Thought lo1 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;

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
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld0 = 906.0244324385126;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    ab3 = ad4 > fd0;
    ab4 = fd1 > ld0;
if(fo1 != null){
      fo1.m2();
}
    fb0 = fb1 && lb1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      ad1 = fo1.m3(ab1, ab2, ab3, ab4);
}
    ad2 *= -1;

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
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    double ld1 = 118.63237950039527;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + ld1;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
}
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
        fd0 = fd1 - ld1;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb1, lb0, lb2, fb0);
}
        fd1 = ld1 + fd0;
    fb1 = fd1 > ld1;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, lb0, lb2, fb0, fb1);
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
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
    double ld0 = 956.7944928479174;
    Output.points[8][4] += ad3;
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2();
}
    ad4 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    lb1 = lb2 || fb0;
    fb1 = fd1 < ld0;
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
}
    double ld3 = 256.36244739991474;
    lb1 = fd0 < fd1;
    Thought lo4 = Thought173.getInstance(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb1);
    lb2 = fb0 && fb1;
if(ao2 != null){
      lb1 = ao2.m2();
}
    ld0 = ld3 + ad1;
    ad2 = ad3 + ad4;
    lb2 = fd0 < fd1;

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
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ab3 = !ab4;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    ab4 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;

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
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[8][5] -= ad2;
    fb1 = ad3 < ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    Output.points[8][6] -= fd0;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao3.m2();
}
    boolean lb1 = true;
    ab3 = ab4 || fb0;
    fb1 = lb0 || lb1;
    ab1 = !ab2;
    ad3 = ad4 - fd0;
    ab3 = ab4 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought315.getInstance(ab2, ab3, ab4, fb0);
    ad4 = fd0 - fd1;
    Thought lo3 = Thought302.getInstance(ao4, fo0, fo1, ao1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought1.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        boolean lb2 = true;
        double ld3 = 966.8414100929576;
if(fo1 != null){
          fo0 = fo1.m4(ld3, fd0, fd1, ld3, lb2, lb0, fb0, fb1);
}
        Output.points[8][7] -= fd0;
        double ld4 = 987.9386355457992;
        Thought lo5 = Thought356.getInstance(fo0, fo1, fo0, fo1, lb2, lb0, fb0, fb1);
        lb2 = fd0 < fd1;
        ld3 = ld4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb0 = fb0 || fb1;
        Thought lo6 = Thought34.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, ld4, fd0, lb2, lb0, fb0, fb1);
        lb2 = !lb0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb2, lb0);
}
        double ld7 = 911.1566744941357;
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 995.582305736582;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
        ab1 = ab2 && ab3;
        ld0 = fd0 - fd1;
        ab4 = ld0 > fd0;
        double ld2 = 525.5475726465315;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, fb0, fb1, lb1, ab1);
}
        ab2 = !ab3;
        ab4 = fd0 < fd1;
        fb0 = ld0 < ld2;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ab3 = !ab4;
        Thought lo3 = Thought201.getInstance(fd1, ld0, ld2, fd0);
        fd1 *= -1;
        boolean lb4 = false;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
if(fo1 != null){
          fo1.m1(ld2, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
        lb4 = ld2 > fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          ad2 = fo1.m3();
}
        boolean lb0 = false;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        Thought lo1 = Thought5.getInstance(fb1, lb0, fb0, fb1);
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 369.041414485324;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought93.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought367.getInstance(ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && ab1;
        boolean lb3 = true;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - ld0;
        double ld4 = 43.33400999878329;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld0);
}
        ad1 *= -1;
        ad2 *= -1;
        ab2 = ab3 && ab4;
        fb0 = !fb1;
        double ld5 = 76.4415588299362;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb3, ab1, ab2, ab3);
}
        boolean lb6 = false;
        ab3 = fd1 < ld4;
        boolean lb7 = true;
        ab3 = ab4 || fb0;
        ld5 = ld0 + ad1;
        ad2 = ad3 - ad4;
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
    boolean lb0 = true;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
    fd0 *= -1;
    lb1 = !fb0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      lb0 = ao2.m2();
}
    Thought lo2 = Thought27.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
    lb1 = !fb0;
    Output.points[8][8] += fd1;
    boolean lb3 = true;

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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Output.points[0][0] += ad1;
    Thought lo0 = Thought52.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    boolean lb1 = false;
    Thought lo2 = Thought382.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 *= -1;
    boolean lb3 = false;
    boolean lb4 = false;
    lb3 = ad1 < ad2;
    Thought lo5 = Thought187.getInstance(ad3, ad4, fd0, fd1, lb4, fb0, fb1, lb1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb3, lb4, fb0, fb1);
}
    lb1 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb3 = lb4 && fb0;
    Thought lo6 = Thought263.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb1, lb3, lb4);
    ad1 = ad2 - ad3;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb1, lb3);
}
    lb4 = fb0 && fb1;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 14.184137839944325;
    ab2 = ab3 || ab4;
    boolean lb1 = false;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought63.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb1;
    boolean lb3 = true;
    lb3 = ab1 || ab2;
    Output.points[0][1] += fd0;
    ab3 = fd1 < ld0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
        fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd1, ld0, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought229.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(ao1 != null){
      ad3 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb2 = true;
    Output.points[0][2] += ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ab2 = !ab3;
    boolean lb3 = false;
    ad2 *= -1;
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought38.getInstance();
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
        Thought lo2 = Thought306.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab4 = !fb0;
    fb1 = lb0 || ab1;
    Thought lo1 = Thought191.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad1 *= -1;
    double ld0 = 44.64135934294108;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    double ld1 = 802.3051290936501;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    boolean lb3 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    lb3 = fb0 || fb1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        ab3 = ad3 > ad4;
        ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
        fd0 = fd1 + ad1;
        }
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
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
    Thought lo0 = Thought345.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = fd1 < fd0;
    boolean lb2 = false;
    boolean lb3 = true;
    lb1 = lb2 && lb3;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb2);
}
    fd0 = fd1 + fd0;
    lb3 = fb0 || fb1;
    lb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb2, lb3, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb4 = false;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    lb2 = lb3 && lb4;
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        boolean lb2 = true;
if(ao1 != null){
          ao1.m2(fd0, fd1, ad1, ad2, lb1, lb2, lb0, fb0);
}
        fb1 = ad3 < ad4;
        Output.points[0][3] -= fd0;
        fd1 *= -1;
        for(int i1=0; i1<10; i1++){
            ad1 *= -1;
if(ao2 != null){
              ad2 = ao2.m3(ao3, ao4, fo0, fo1, lb1, lb2, lb0, fb0);
}
if(ao1 != null){
              ao1.m3();
}
            ad3 *= -1;
            fb1 = lb1 || lb2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    Output.points[0][4] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 + fd1;
    ab3 = fd0 < fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    double ld1 = 222.06866932990945;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0);
}
    ab3 = fd1 < ld1;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    ld1 = fd0 + fd1;
if(ao1 != null){
      ab2 = ao1.m2();
}
    ab3 = ab4 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[0][5] -= fd0;
if(ao1 != null){
      lb0 = ao1.m2(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought61.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 || lb0;
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(fd1, ld1, fd0, fd1);
}
    Thought lo4 = Thought343.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought46.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb3);

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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m3();
}
    ab4 = ad1 < ad2;
    fb0 = fb1 || ab1;
    double ld0 = 445.3273823705721;
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
    ab3 = ld0 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    fd1 = ld0 + ad1;
    fb1 = ab1 && ab2;
    ab3 = ad2 < ad3;
    ab4 = !fb0;
    fb1 = ad4 < fd0;
    Thought lo1 = Thought45.getInstance(ao3, ao4, fo0, fo1);
    boolean lb2 = false;
    lb2 = fd1 < ld0;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
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
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought185.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought283.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
        fb0 = fd1 < fd0;
        Output.points[0][6] -= fd1;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        for(int i1=0; i1<10; i1++){
            ab1 = ab2 || ab3;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
              fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
            fd0 = fd1 - fd0;
            fd1 *= -1;
            fd0 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              fo1 = fo0.m4();
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
    ad2 = ad3 + ad4;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought35.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = ad1 > ad2;
    Thought lo2 = Thought372.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
        ad1 *= -1;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    boolean lb5 = true;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Thought lo0 = Thought149.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
    double ld1 = 250.1420409331034;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        }
    Thought lo2 = Thought392.getInstance();
    double ld3 = 600.6285473607096;
    Output.points[0][7] -= ld1;
    Thought lo4 = Thought304.getInstance(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    double ld5 = 313.15045579637155;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
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
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
        boolean lb0 = false;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought17.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought162.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
    double ld3 = 883.7257697829668;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb4, fb0, fb1, lb0);
}
    Output.points[0][8] -= ld3;
    fd0 = fd1 - ld3;
    Output.points[1][0] += fd0;
    lb4 = !fb0;

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
    Thought lo0 = Thought134.getInstance();
        fb1 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought226.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    boolean lb2 = false;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Output.points[1][1] -= fd1;
    Thought lo3 = Thought258.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb2, fb0);
    if (fb1) {
if(ao3 != null){
          ao3.m1();
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
        fd0 = fd1 - ad1;
        fb0 = fb1 || lb2;
        Thought lo4 = Thought185.getInstance(fb0, fb1, lb2, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][2] -= fd1;
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 *= -1;
    ab3 = fd0 < fd1;
    fd0 *= -1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought262.getInstance(fd1, fd0, fd1, fd0);
    lb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    if (ab4) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad2 = ad3 + ad4;
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    Output.points[1][3] -= ad1;
    boolean lb1 = true;
    double ld2 = 651.4346345578205;
    fb0 = ad1 < ad2;
    double ld3 = 992.7198814783708;
    for(int i0=0; i0<10; i0++){
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
      fd1 = fo1.m3();
}
    Thought lo0 = Thought259.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought112.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = !lb1;
        double ld3 = 988.3854359199038;
    ld3 = fd0 - fd1;
    boolean lb4 = false;
    lb4 = !fb0;
    fb1 = ld3 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
    Thought lo5 = Thought288.getInstance(ld3, fd0, fd1, ld3, lb1, lb4, fb0, fb1);
    lb1 = !lb4;
    boolean lb6 = false;
    Thought lo7 = Thought159.getInstance(fo0, fo1, fo0, fo1, lb6, fb0, fb1, lb1);
        fd0 = fd1 + ld3;
    fd0 = fd1 - ld3;

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
      fd1 = fo0.m3();
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    double ld1 = 881.8705246948966;
    fd0 *= -1;
    Output.points[1][4] -= fd1;
    Thought lo2 = Thought108.getInstance(fb0, fb1, lb0, fb0);
    double ld3 = 586.6796847024232;

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
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought123.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[1][5] -= fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    double ld2 = 304.7926321918504;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    fd0 = fd1 - ld2;
    Output.points[1][6] += fd0;
    double ld4 = 351.4469580453144;

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
