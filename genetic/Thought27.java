package genetic;
import java.util.ArrayList;
class Thought27 extends Thought{
private static ArrayList<Thought27> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 871.4146480839103;
private double fd1 = 993.2825638235663;
private Thought fo0 = null;
private Thought fo1 = null;
Thought27 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought27 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought27 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought27 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought27 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought27 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought27 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought27 instance = new Thought27 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[4][2] += fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought265.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m3();
}
    Output.points[4][3] -= fd1;
    Output.points[4][4] += fd0;
    fd1 *= -1;
    double ld1 = 802.9101571035994;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought98.getInstance(fb0, fb1, fb0, fb1);
    Thought lo3 = Thought349.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || fb0;
        boolean lb4 = false;
    Output.points[4][5] += fd0;
    Thought lo5 = Thought298.getInstance(fd1, ld1, fd0, fd1);

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
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
        double ld0 = 999.1195288746245;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1();
}
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought148.getInstance(fo1, fo0, fo1, fo0);
    fb0 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ld0 *= -1;

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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought134.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    lb1 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    double ld2 = 205.0357354639045;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
    lb1 = ad4 > fd0;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought123.getInstance(ad2, ad3, ad4, fd0);
    double ld1 = 256.6242503389595;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      lb2 = fo0.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought335.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, ab1);
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab2 = !ab3;
    ld1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
    Thought lo4 = Thought144.getInstance(ab1, ab2, ab3, ab4);
    ld1 = ad1 - ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m2(fd1, ld1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fb0 = fb1 || lb2;
    double ld5 = 425.0893206105533;
    ab1 = ab2 && ab3;
    Thought lo6 = Thought281.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld5);
if(fo0 != null){
      ab4 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
}
    fd0 = fd1 - ld1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Output.points[4][6] += fd1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1();
}
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought148.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Output.points[4][7] -= fd1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        double ld1 = 164.01179418126654;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3();
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
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > ad1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought318.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    boolean lb2 = true;
    ad4 *= -1;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo3 = Thought124.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
if(ao1 != null){
      ao1.m3(lb2, fb0, fb1, lb0);
}
    fd0 = fd1 - ad1;
    boolean lb4 = false;

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
    ab2 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        Thought lo1 = Thought67.getInstance(ao2, ao3, ao4, fo0);
        boolean lb2 = false;
        Thought lo3 = Thought35.getInstance(fd1, fd0, fd1, fd0);
        ab1 = fd1 < fd0;
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        ab3 = !ab4;
        double ld4 = 836.7209761000593;
        fd0 *= -1;
        Thought lo5 = Thought149.getInstance(fd1, ld4, fd0, fd1, fb0, fb1, lb0, lb2);
        ab1 = ld4 > fd0;
        ab2 = ab3 || ab4;
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
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              ad1 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
            boolean lb0 = false;
            ad2 *= -1;
            ab4 = !fb0;
            boolean lb1 = false;
            fb0 = ad3 > ad4;
            fd0 *= -1;
            fb1 = fd1 > ad1;
            if (lb0) {
                lb1 = ad2 > ad3;
if(fo1 != null){
                  ab1 = fo1.m2();
}
                ab2 = ad4 < fd0;
if(ao2 != null){
                  ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
                ad4 = fd0 - fd1;
if(ao2 != null){
                  ao1 = ao2.m4(lb0, lb1, ab1, ab2);
}
if(ao3 != null){
                  ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
                  ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
                  fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
                Output.points[4][8] += ad4;
                boolean lb2 = false;
                double ld3 = 838.7182479727014;
if(ao3 != null){
                  ao2 = ao3.m4(ad4, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
}
}}}
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
    fd1 = fd0 - fd1;
        boolean lb0 = false;
    double ld1 = 869.8990450091644;
    boolean lb2 = false;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    lb0 = !lb2;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = !lb0;
    fd0 = fd1 + ld1;
    lb2 = fd0 > fd1;
    Thought lo3 = Thought22.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
        fb0 = fb1 && lb0;
if(fo0 != null){
      fd0 = fo0.m3(lb2, fb0, fb1, lb0);
}
    Thought lo4 = Thought255.getInstance(fo1, fo0, fo1, fo0);
    Thought lo5 = Thought187.getInstance(fd1, ld1, fd0, fd1);
    ld1 *= -1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    boolean lb6 = true;
    lb0 = fd1 < ld1;
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld1, fd0, lb6, fb0, fb1, lb0);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    double ld0 = 422.26228813992475;
    fd0 = fd1 - ld0;
if(fo0 != null){
          fo1 = fo0.m4();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[5][0] += fd1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought103.getInstance(ad1, ad2, ad3, ad4);
    double ld2 = 276.4312003853261;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
}
    fb0 = !fb1;
    double ld3 = 73.67576517734653;
    boolean lb4 = true;
    lb4 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb4, fb0);
}
    boolean lb5 = false;
    fb0 = fb1 && lb4;
    ld2 = ld3 - ad1;

Thought.STACK_COUNTER++;
return lb5;
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
    Thought lo0 = Thought57.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    boolean lb1 = false;
    lb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    if (ab1) {
        double ld2 = 790.1358342090801;
        Thought lo3 = Thought159.getInstance();
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 && ab1;
        ab2 = ab3 || ab4;
        fb0 = fd1 < ld2;
        double ld4 = 719.3432914845529;
        fb1 = !lb1;
        Output.points[5][1] -= ld4;
        boolean lb5 = false;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              ad1 = fo0.m3(lb1, ab1, ab2, ab3);
}
            }
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld6 = 243.17151092570404;
        ad1 = ad2 + ad3;
        ab4 = !fb0;
        Output.points[5][2] += ad4;
        fd0 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought139.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    Output.points[5][3] += fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fb1 = lb0 && fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[5][4] += fd1;
    fb1 = !lb0;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    boolean lb2 = false;

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
    Thought lo0 = Thought149.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        }
if(ao2 != null){
      ao2.m2(lb1, fb0, fb1, lb1);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    ad2 = ad3 + ad4;
    for(int i1=0; i1<10; i1++){
        fd0 = fd1 - ad1;
        fb0 = ad2 > ad3;
        boolean lb2 = false;
        ad4 = fd0 - fd1;
        fb0 = ad1 > ad2;
        fb1 = lb2 || lb1;
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
        double ld3 = 80.5459683154285;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        ld3 *= -1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought283.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3();
}
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    Thought lo2 = Thought256.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, ab1, ab2);
}
    Output.points[5][5] -= fd1;
    ab3 = fd0 < fd1;
    boolean lb3 = true;
    boolean lb4 = false;
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && lb1;
    lb3 = !lb4;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
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
    ad2 *= -1;
    ad3 *= -1;
    ab1 = ad4 > fd0;
    Thought lo0 = Thought393.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb1 = ad1 > ad2;
    if (ab1) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m2(fb1, ab1, ab2, ab3);
}
        if (ab4) {
            fb0 = ad1 > ad2;
if(ao1 != null){
              ao1.m3(ao2, ao3, ao4, fo0);
}
            fb1 = ad3 > ad4;
            Thought lo1 = Thought221.getInstance(fd0, fd1, ad1, ad2);
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
}}
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
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2();
}
        fb0 = !fb1;
        fb0 = fd1 > fd0;
        Output.points[5][6] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        Output.points[5][7] -= fd0;
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        Thought lo1 = Thought108.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        double ld2 = 220.14332348183723;
        boolean lb3 = false;
        lb3 = fb0 && fb1;
        boolean lb4 = false;
        lb0 = fd0 < fd1;
        lb3 = ld2 > fd0;
        fd1 *= -1;
        lb4 = ld2 < fd0;
        fd1 = ld2 + fd0;
        fb0 = !fb1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1();
}
    ab4 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        ab4 = fd0 > fd1;
        Thought lo0 = Thought155.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        double ld1 = 268.66648558271896;
        boolean lb2 = true;
        double ld3 = 17.538771003138034;
        ab3 = ab4 && fb0;
        fb1 = ld1 < ld3;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, ld3, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4();
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[5][8] -= fd1;
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    double ld1 = 721.790206159846;
    ad4 = fd0 - fd1;
    Output.points[6][0] += ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][1] += ad1;
    Output.points[6][2] += ad2;

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
    ab2 = ad1 > ad2;
if(fo0 != null){
      ab3 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    fd0 = fd1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    double ld2 = 955.1145111263917;
    Thought lo3 = Thought16.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ld2 = ad1 + ad2;
    Thought lo4 = Thought137.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    Thought lo5 = Thought350.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought278.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
if(ao1 != null){
      fd1 = ao1.m3();
}
    boolean lb2 = true;
    lb1 = fd0 < fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
    lb2 = !fb0;
if(ao1 != null){
      ao1.m2(fb1, lb1, lb2, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    lb1 = lb2 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[6][3] -= fd1;
    if (fb1) {
        Output.points[6][4] -= fd0;
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fd1 *= -1;
        lb1 = fd0 < fd1;
        fd0 = fd1 - fd0;
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
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
        double ld0 = 256.16600221730187;
        fb1 = fb0 || fb1;
        fb0 = !fb1;
        fb0 = ad4 < fd0;
if(ao2 != null){
          fd1 = ao2.m3();
}
        fb1 = ld0 < ad1;
        boolean lb1 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
          fd1 = ao2.m3(fb0, fb1, lb1, fb0);
}
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m3(ad1, ad2, ad3, ad4);
}
        boolean lb2 = false;
        boolean lb3 = false;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
        lb3 = fb0 && fb1;
}
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
    boolean lb0 = false;
    Thought lo1 = Thought75.getInstance(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
    Output.points[6][5] -= fd0;
    Output.points[6][6] -= fd1;
    Thought lo2 = Thought56.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        lb3 = lb0 || ab1;
        ab2 = ab3 && ab4;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fb1 = fo1.m2();
}
        fd0 = fd1 - fd0;
        fd1 *= -1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb3, lb0, ab1, ab2);
}
        boolean lb4 = false;
        fd0 = fd1 - fd0;
if(ao1 != null){
          fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = lb3 && lb4;
        lb0 = fd1 < fd0;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought101.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[6][7] -= ad4;
    boolean lb1 = false;
        fd0 = fd1 - ad1;
    ad2 *= -1;
    boolean lb2 = false;
    lb2 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[6][8] -= ad1;
    double ld3 = 829.5316878130861;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    double ld4 = 935.8514661967101;
    boolean lb5 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, lb2, lb5, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld3, ld4, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb1, lb2, lb5);
}
    Output.points[7][0] -= ad3;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo6 = Thought178.getInstance(fd0, fd1, ld3, ld4);
    Output.points[7][1] += ad1;
    Thought lo7 = Thought19.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    boolean lb8 = false;

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
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 *= -1;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    lb1 = fb0 || fb1;
    boolean lb2 = true;
    boolean lb3 = false;
    double ld4 = 872.0620005123941;
    double ld5 = 942.5973939861924;
    Output.points[7][2] -= ld5;
    Thought lo6 = Thought207.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);

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
    ab1 = fd0 < fd1;
    Thought lo0 = Thought54.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fb1, ab1, ab2, ab3);
}
    Output.points[7][3] += fd0;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    double ld2 = 640.5187861541662;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
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
    if (fb0) {
        fb1 = fb0 && fb1;
        Output.points[7][4] -= ad1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
            fd1 *= -1;
            Thought lo0 = Thought17.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
            fd0 = fd1 + ad1;
            ad2 = ad3 - ad4;
            fd0 = fd1 - ad1;
            ad2 = ad3 + ad4;
            fd0 = fd1 + ad1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
            ad2 = ad3 + ad4;
if(fo0 != null){
              fo1 = fo0.m4();
}
            Thought lo1 = Thought255.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo1 != null){
              ad3 = fo1.m3(fb0, fb1, fb0, fb1);
}
            boolean lb2 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            lb2 = !fb0;
if(fo0 != null){
              fo0.m3(ad4, fd0, fd1, ad1);
}
            ad2 = ad3 - ad4;
            fd0 = fd1 + ad1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
            fb1 = lb2 && fb0;
            Thought lo3 = Thought195.getInstance(fd1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3();
}
    fb0 = !fb1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = ad1 > ad2;
    Thought lo0 = Thought318.getInstance(fb1, ab1, ab2, ab3);
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    lb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = lb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[7][5] += ad2;
    ad3 = ad4 + fd0;
    boolean lb2 = false;
    fd1 = ad1 - ad2;
    boolean lb3 = true;

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
    fb0 = fd0 < fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 360.0445189758386;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought162.getInstance(lb1, fb0, fb1, lb1);
    double ld3 = 433.6130022759229;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && lb1;
    boolean lb4 = false;
    double ld5 = 482.660498430896;

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
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought99.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    double ld1 = 864.7410385643091;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
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
      fd0 = ao1.m3();
}
        Thought lo0 = Thought222.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    fd1 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought83.getInstance(ab3, ab4, fb0, fb1);
    lb1 = fd0 < fd1;
    boolean lb4 = true;
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb6 = false;
    for(int i0=0; i0<10; i0++){
        lb2 = fd1 < fd0;
        lb4 = !lb5;
        lb6 = !ab1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld7 = 597.254146252221;
if(ao1 != null){
          ab2 = ao1.m2(fd0, fd1, ld7, fd0, ab3, ab4, fb0, fb1);
}
        Thought lo8 = Thought357.getInstance(ao2, ao3, ao4, fo0, lb1, lb2, lb4, lb5);
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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, ab1, ab2);
}
    double ld0 = 834.6725072707238;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab3 = fd0 > fd1;
if(ao4 != null){
      ao4.m2(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
}
    ab4 = ad1 > ad2;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo1 = Thought329.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Output.points[7][6] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    double ld0 = 821.4759338431683;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought204.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = ld0 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = true;
    double ld3 = 158.72199262960586;
    Thought lo4 = Thought227.getInstance(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1, lb2, fb0, fb1, lb2);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    Thought lo5 = Thought384.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ld0 > ld3;
        Thought lo6 = Thought326.getInstance(fd0, fd1, ld0, ld3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
    double ld7 = 572.3029657839636;
    lb2 = ld7 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld3, ld7, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1();
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        boolean lb1 = true;
    double ld2 = 168.5329773070768;
    Thought lo3 = Thought217.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
    double ld4 = 226.63595651303925;

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
        fb1 = fd0 > fd1;
    Output.points[7][7] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 431.4369920419798;
    ld0 = fd0 - fd1;
    double ld1 = 386.32937183642156;
    Thought lo2 = Thought75.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;

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
