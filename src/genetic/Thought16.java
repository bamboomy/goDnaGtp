package genetic;
import java.util.ArrayList;
class Thought16 extends Thought{
private static ArrayList<Thought16> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 962.0424972374196;
private double fd1 = 511.9165386128048;
private Thought fo0 = null;
private Thought fo1 = null;
Thought16 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought16 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought16 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought3.getInstance();
    fb1 = lb0 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
        fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    fd0 = fd1 + fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    double ld0 = 681.5665241944911;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][2] += fd0;
    fb1 = ab1 && ab2;
    fd1 = ld0 + fd0;
    double ld1 = 597.3637142184493;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, ab4, fb0, fb1, lb2);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
        ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[0][3] -= fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
        double ld2 = 757.8220349186622;
    boolean lb3 = true;
        double ld4 = 506.2932791137084;
    boolean lb5 = true;
    ad2 = ad3 + ad4;
    lb1 = lb3 && lb5;
    fb0 = fd0 < fd1;

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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[0][4] += ad2;
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    double ld0 = 663.6581852263232;
    fb0 = !fb1;
    ad2 = ad3 + ad4;
        ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 || ab2;
    boolean lb1 = false;
    ab2 = ad4 > fd0;
    fd1 = ld0 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2, lb1, ab1, ab2, ab3);
}
    double ld2 = 250.11020555321693;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    fd0 *= -1;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought0.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
    Thought lo3 = Thought1.getInstance();
    Output.points[0][5] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao4.m3(lb0, lb1, fb0, fb1);
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
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    Output.points[0][6] -= fd0;
    fd1 = ad1 + ad2;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    Output.points[0][7] -= ad3;
    boolean lb1 = false;
if(ao1 != null){
      lb0 = ao1.m2(ad4, fd0, fd1, ad1);
}
    Output.points[0][8] -= ad2;
    lb1 = ad3 > ad4;
    fb0 = fd0 > fd1;

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
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
    boolean lb0 = false;
    lb0 = ab1 || ab2;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab3 = ad2 < ad3;
    double ld1 = 315.8389760553832;
    ad3 = ad4 - fd0;
    ab4 = fd1 > ld1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld1;
        for(int i1=0; i1<10; i1++){
            ab3 = ad1 < ad2;
            ad3 *= -1;
            ab4 = !fb0;
if(fo0 != null){
              fo0.m2(ad4, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
            double ld2 = 371.30324125273705;
            ld1 *= -1;
if(fo1 != null){
              ab3 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
              fd0 = fo0.m3();
}
            boolean lb3 = true;
            ab3 = fd1 > ld2;
if(fo1 != null){
              ld1 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
              fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
            ab4 = !fb0;
            fb1 = ad1 < ad2;
            ad3 = ad4 - fd0;
            boolean lb4 = true;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    lb1 = !fb0;
    double ld2 = 759.5759562540408;
    ld2 = fd0 + fd1;
    Output.points[1][0] -= ld2;
    fd0 = fd1 + ld2;
    Thought lo3 = Thought12.getInstance();
    double ld4 = 710.1324503242764;
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = ld2 < ld4;
        lb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb1, fb0);
}
    Thought lo5 = Thought9.getInstance(ld2, ld4, fd0, fd1);
    Output.points[1][1] += ld2;
    ld4 = fd0 - fd1;
    Thought lo6 = Thought8.getInstance(fo1, fo0, fo1, fo0);
    Thought lo7 = Thought17.getInstance(fo1, fo0, fo1, fo0, ld2, ld4, fd0, fd1, fb1, lb0, lb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Output.points[1][2] += ld2;

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
    boolean lb0 = false;
    Thought lo1 = Thought5.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    Output.points[1][3] -= fd0;
    Output.points[1][4] -= fd1;
    double ld2 = 563.3225441612848;
    double ld3 = 61.566299475146565;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb0);
}
    double ld4 = 369.2450177791658;
    ld2 = ld3 - ld4;
            Thought lo5 = Thought11.getInstance(fd0, fd1, ld2, ld3);
    boolean lb6 = true;
    ld4 = fd0 - fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought9.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought1.getInstance();
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
    boolean lb0 = true;
    lb0 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][5] -= ad3;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
        fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        ab2 = ad4 > fd0;
        Output.points[1][6] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought19.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m2();
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    Thought lo1 = Thought9.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    fd0 = fd1 + fd0;

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
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[1][7] -= fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;

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
    Thought lo0 = Thought14.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 735.0624626785618;
    ld1 = fd0 - fd1;
    double ld2 = 297.6732511277797;
if(ao2 != null){
              ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = ld2 > fd0;
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ld2, fd0, lb3, ab1, ab2, ab3);
}
    ab4 = fd1 < ld1;
    ld2 *= -1;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ld2, fd0, fd1, ld1, fb0, fb1, lb3, ab1);
}
    ab2 = ab3 && ab4;
    ld2 = fd0 - fd1;
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld2, fd0, fd1);
}
    ld1 = ld2 + fd0;
if(ao3 != null){
      ab4 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb3, lb4);
}
    boolean lb5 = false;
    fd1 *= -1;
    ld1 = ld2 + fd0;
    lb5 = fd1 > ld1;
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;

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
    Thought lo0 = Thought7.getInstance(ad2, ad3, ad4, fd0);
    Thought lo1 = Thought16.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought2.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    fb1 = ab1 && ab2;
if(ao3 != null){
      ad1 = ao3.m3();
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
    Output.points[1][8] -= ad2;

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
    Thought lo0 = Thought17.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld2 = 348.2134294807248;
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    ld2 = fd0 - fd1;
    lb3 = ld2 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    if (fb1) {
        for(int i0=0; i0<10; i0++){
            lb3 = fd1 < ld2;
if(fo0 != null){
              fd0 = fo0.m3(fb0, fb1, lb3, fb0);
}
            Thought lo4 = Thought4.getInstance(fd1, ld2, fd0, fd1);
}}
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
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought18.getInstance(fo1, fo0, fo1, fo0);
        Output.points[2][0] += fd1;
        ab3 = fd0 > fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        }
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[2][1] += fd0;
    ab4 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    boolean lb3 = false;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb1 = lb2 && lb3;
    ab1 = fd1 < fd0;
    if (ab2) {
        boolean lb4 = false;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        ad2 *= -1;
        lb0 = ad3 > ad4;
        fb0 = !fb1;
        if (lb0) {
            fd0 = fd1 + ad1;
if(fo0 != null){
              fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
            Output.points[2][2] -= fd1;
            ad1 = ad2 + ad3;
            ad4 *= -1;
            fb1 = fd0 > fd1;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ad2 < ad3;
    boolean lb0 = true;
    ab3 = ad4 > fd0;
    Thought lo1 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
    ab1 = ab2 && ab3;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought7.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ab1 = ad3 < ad4;
    Thought lo3 = Thought12.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, ab1, ab2, ab3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 413.0650612297749;
if(ao2 != null){
          fb0 = ao2.m2(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    ld0 *= -1;
    fb0 = fd0 > fd1;
    ld0 = fd0 + fd1;

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
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ad4 = ao3.m3();
}
    Thought lo0 = Thought8.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought5.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Output.points[2][3] -= ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 = fd1 - ad1;
    fb1 = ad2 < ad3;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought13.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
    fb0 = fb1 || fb0;

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
    Thought lo0 = Thought9.getInstance(ab2, ab3, ab4, fb0);
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought10.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb3 = false;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;
    ab3 = ab4 || fb0;

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
    Output.points[2][4] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(ao4 != null){
      ab2 = ao4.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    Output.points[2][5] += ad4;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought18.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought3.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao1 != null){
      ao1.m2();
}
    fb1 = ad4 > fd0;
    boolean lb2 = false;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 || lb2;
    Thought lo3 = Thought13.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;
    Thought lo5 = Thought1.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb2);
}
    Thought lo6 = Thought13.getInstance(ad3, ad4, fd0, fd1, lb4, ab1, ab2, ab3);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    ad1 = ad2 + ad3;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        double ld0 = 847.6028207003748;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
        boolean lb1 = false;
        Thought lo2 = Thought1.getInstance();
        fb0 = fd0 < fd1;
        fb1 = !lb1;
        fb0 = fb1 || lb1;
        ld0 = fd0 + fd1;
        fb0 = ld0 < fd0;
        fb1 = lb1 || fb0;
        Thought lo3 = Thought5.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
        Thought lo4 = Thought6.getInstance(lb1, fb0, fb1, lb1);
        fd1 *= -1;
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
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = true;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb4 = false;
    Output.points[2][6] -= fd1;
    boolean lb5 = false;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    double ld0 = 289.37472514417914;
    double ld1 = 436.2309897248293;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    ld0 = ld1 - ad1;
    Thought lo2 = Thought15.getInstance(ad2, ad3, ad4, fd0);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1, fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb3, fb0, fb1);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}
    double ld4 = 967.0038108094388;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[2][7] += ad4;
    fd0 *= -1;
    fd1 = ld0 + ld1;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb3);
}
    double ld6 = 258.27082189041505;

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
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
    ab2 = ad3 > ad4;
    ab3 = !ab4;
    double ld0 = 116.48482241114338;
    fb0 = fb1 && ab1;
    ad4 = fd0 + fd1;
    Thought lo1 = Thought19.getInstance(ld0, ad1, ad2, ad3);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    double ld2 = 938.7131483792915;
    double ld3 = 838.4210721390975;
    boolean lb4 = true;
    lb4 = ld3 < ad1;
    boolean lb5 = true;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ld2, lb5, ab1, ab2, ab3);
}
    ab4 = !fb0;
    ld3 *= -1;

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
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2(lb0, lb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought8.getInstance(fd1, fd0, fd1, fd0);

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
    boolean lb0 = true;
    lb0 = ad2 > ad3;
    Output.points[2][8] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + ad1;
    Output.points[3][0] += ad2;
    Thought lo1 = Thought1.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4();
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
    ab2 = ab3 && ab4;
    fd0 *= -1;
    Thought lo0 = Thought0.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    Output.points[3][1] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = ab3 && ab4;
    double ld1 = 472.21199136588336;
    fd0 = fd1 + ld1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = !ab2;
    ab3 = ab4 || fb0;
        fb1 = ab1 && ab2;
    boolean lb0 = false;
    ab2 = ad1 > ad2;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo4 = Thought18.getInstance();
    fb0 = fd0 > fd1;
    boolean lb5 = true;
    Thought lo6 = Thought14.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
    boolean lb7 = true;
    lb2 = lb3 && lb5;
    boolean lb8 = false;
    Thought lo9 = Thought14.getInstance(lb7, lb8, ab1, ab2);
    double ld10 = 21.923491673492716;

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
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
        double ld0 = 490.95325743903885;
    ld0 = fd0 + fd1;
    fb1 = fb0 || fb1;
    ld0 *= -1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
    double ld2 = 14.277624264099883;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
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
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought17.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    Output.points[3][2] += fd0;
    Thought lo2 = Thought11.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 - fd1;
    lb0 = !fb0;
    Thought lo3 = Thought2.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    Thought lo4 = Thought5.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought13.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        Output.points[3][3] += fd0;
        double ld1 = 146.8600797055234;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought7.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb3, fb0);
}
    double ld4 = 923.796917061604;
    fb1 = !lb3;

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
