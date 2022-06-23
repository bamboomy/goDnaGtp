package genetic;
import java.util.ArrayList;
class Thought68 extends Thought{
private static ArrayList<Thought68> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 338.55697310321483;
private double fd1 = 150.30374617604642;
private Thought fo0 = null;
private Thought fo1 = null;
Thought68 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought68 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought68 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought68 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought68 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought68 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought68 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought68 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought68 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought68 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought68 instance = new Thought68 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    Output.points[8][2] += fd1;
    lb0 = !fb0;
    fb1 = !lb0;
    double ld1 = 851.4362912094615;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ld1 + fd0;
    fb1 = fd1 > ld1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    if (fb1) {
        lb0 = fb0 && fb1;
        lb0 = fb0 && fb1;
        fd0 *= -1;
        lb0 = fd1 > ld1;
        fd0 *= -1;
        for(int i0=0; i0<10; i0++){
            fb0 = fd1 > ld1;
            fb1 = fd0 < fd1;
            lb0 = ld1 > fd0;
            fd1 *= -1;
            boolean lb2 = true;
            lb0 = fb0 || fb1;
            lb2 = !lb0;
            ld1 = fd0 - fd1;
            fb0 = fb1 || lb2;
            boolean lb3 = true;
            ld1 = fd0 + fd1;
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
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought32.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb2 = !ab1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
    ab1 = fd1 < fd0;

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
    double ld0 = 843.5791426836936;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    Output.points[8][3] += ad1;
    boolean lb2 = false;
    lb2 = ad2 > ad3;
    fb0 = ad4 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ld0 = fo0.m3(ad1, ad2, ad3, ad4, fb1, lb1, lb2, fb0);
}
    if (fb1) {
        boolean lb3 = false;
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
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought94.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
        Output.points[8][4] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought70.getInstance();
    double ld2 = 172.59423696970268;
    Thought lo3 = Thought60.getInstance(ld2, ad1, ad2, ad3);
    ab1 = !ab2;
    ad4 = fd0 + fd1;
    Thought lo4 = Thought28.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ld2 < ad1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Output.points[8][5] -= ld2;
    double ld5 = 851.271703068036;

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
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    Output.points[8][6] += fd1;

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
    double ld0 = 714.8128957774888;
    double ld1 = 207.2872610300153;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb2 = false;
    ld1 *= -1;
    ad1 = ad2 - ad3;
    if (lb2) {
if(fo1 != null){
          fo1.m1(ad4, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
        } else if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb3 = true;
        double ld4 = 559.7912594377493;
        boolean lb5 = true;
        lb3 = !lb5;
        boolean lb6 = true;
        double ld7 = 45.384778717279104;
        ld7 *= -1;
        double ld8 = 947.5005170687463;
        ld8 *= -1;
        lb6 = ld0 > ld1;
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
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    Thought lo1 = Thought9.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    Output.points[8][7] -= fd1;

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
    Thought lo0 = Thought39.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
if(fo1 != null){
      lb1 = fo1.m2();
}
    Output.points[8][8] -= fd0;
if(ao1 != null){
      lb2 = ao1.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
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
    Output.points[0][0] += fd0;
    double ld0 = 213.84812862313103;
    Output.points[0][1] += fd0;
    boolean lb1 = true;
    boolean lb2 = false;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb1, lb2, fb0, fb1);
}
    Output.points[0][2] -= ld0;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb1, lb2, lb3, fb0);
}
    fb1 = lb1 && lb2;
    lb3 = fd0 > fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    Thought lo4 = Thought85.getInstance();
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    fb0 = ld0 > fd0;
        Thought lo5 = Thought62.getInstance(fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
    fb1 = lb1 || lb2;
    ld0 *= -1;
    fd0 = fd1 + ld0;

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[0][3] += fd0;
        fb1 = !ab1;
        fd1 = fd0 - fd1;
        ab2 = fd0 < fd1;
        ab3 = ab4 && fb0;
        fb1 = !ab1;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fb0 || fb1;
    if (fb0) {
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        fb0 = ad1 < ad2;
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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[0][4] -= ad2;
    ab1 = ad3 > ad4;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ab3 = fd1 < ad1;
    boolean lb2 = true;
    Thought lo3 = Thought27.getInstance(fo0, fo1, fo0, fo1);
    Thought lo4 = Thought14.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);

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
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    Output.points[0][5] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought90.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    Output.points[0][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = lb0 || fb0;
    Thought lo2 = Thought99.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
    Output.points[0][7] += fd0;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb3 = false;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    lb3 = fb0 || fb1;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Output.points[0][8] += ad1;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
    double ld1 = 553.1423738531425;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    Output.points[1][0] += fd0;
    Output.points[1][1] -= fd1;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
    ld1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[1][2] += ld1;
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    Output.points[1][3] -= fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    double ld2 = 800.3609046099435;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ld2 = ad1 + ad2;
    boolean lb3 = false;
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb3, lb4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 871.4334660181178;
    ab1 = !ab2;
    double ld2 = 787.9272302078725;
    ab3 = ld1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    boolean lb3 = false;
    Output.points[1][4] += fd0;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = !ab2;
    Thought lo0 = Thought93.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Output.points[1][5] += ad4;
    fd0 = fd1 - ad1;
    ab2 = ad2 < ad3;
    ab3 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    double ld1 = 956.0930612285766;
if(ao1 != null){
      ao1.m2();
}
    double ld2 = 891.62525201154;
if(ao2 != null){
      ab2 = ao2.m2(ad2, ad3, ad4, fd0);
}
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    Thought lo3 = Thought78.getInstance(fo0, fo1, ao1, ao2, fd1, ld1, ld2, ad1);
    ab3 = ab4 && fb0;
    fb1 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
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
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought92.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld4 = 248.01266293105905;
    Thought lo5 = Thought50.getInstance(fd0, fd1, ld4, fd0);
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, fb0);
}
    boolean lb6 = true;
    fd1 = ld4 + fd0;
    fb0 = fd1 > ld4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
}
    fb1 = fd1 < ld4;
    lb0 = lb1 && lb2;
    boolean lb7 = false;
    boolean lb8 = true;
    fd0 = fd1 - ld4;
    fd0 = fd1 - ld4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, lb6, lb7, lb8, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
    fd1 = ld4 - fd0;
    lb6 = lb7 || lb8;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ld4, fd0, fd1, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return ld4;
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
    Output.points[1][6] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    double ld0 = 272.69437914618544;
    double ld1 = 808.0788623318576;
    fb1 = ld0 > ld1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    ad2 *= -1;
    lb0 = !fb0;
    double ld1 = 450.90657578131663;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = ad1 > ad2;
        boolean lb0 = false;
        ab4 = ad3 > ad4;
        }
    fd0 = fd1 + ad1;
        ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
    Thought lo1 = Thought42.getInstance(ab2, ab3, ab4, fb0);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
    fd0 *= -1;
    if (ab4) {
        double ld4 = 617.7475784053682;
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
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought26.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        Thought lo1 = Thought22.getInstance(fo0, fo1, ao1, ao2);
        fb1 = fd0 > fd1;
        for(int i1=0; i1<10; i1++){
if(ao3 != null){
              ao3.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
            boolean lb2 = false;
if(ao4 != null){
              fd0 = ao4.m3();
}
            Thought lo3 = Thought89.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
              fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
            fb0 = fd1 < fd0;
            fd1 *= -1;
            double ld4 = 696.572888306919;
            double ld5 = 780.1826897697994;
            fb1 = lb2 && fb0;
            fb1 = lb2 || fb0;
            Output.points[1][7] += ld4;
            fb1 = !lb2;
            double ld6 = 107.56087784039158;
            Output.points[1][8] -= ld5;
            boolean lb7 = true;
            double ld8 = 578.4096017621877;
            ld6 = ld8 + fd0;
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
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 662.349821671179;
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought40.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    double ld1 = 698.0469853701441;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = !ab4;
    double ld2 = 304.0860989683541;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb3 = false;
    ab3 = !ab4;

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
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    Thought lo2 = Thought60.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    lb0 = lb1 || ab1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fb1 = lb0 || lb1;
    fd0 *= -1;
    Thought lo3 = Thought61.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    if (fb0) {
        fb1 = lb0 && lb1;
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        boolean lb4 = false;
        fb0 = ad4 > fd0;
        fb1 = fd1 < ad1;
        boolean lb5 = false;
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
    boolean lb0 = false;
    Thought lo1 = Thought38.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 *= -1;
    Output.points[2][0] -= fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fb0 = fd0 < fd1;
    Output.points[2][1] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
}
    fd1 *= -1;
    boolean lb4 = false;

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
if(fo1 != null){
      fo1.m3();
}
    fd0 *= -1;
    Output.points[2][2] -= fd1;
    ab2 = !ab3;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    Output.points[2][3] -= fd1;
        Thought lo3 = Thought78.getInstance();
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    ab4 = fd0 > fd1;
    Output.points[2][4] += fd0;
    fb0 = fb1 && lb0;

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
    fb1 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    Output.points[2][5] -= ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld0 = 790.1423104287414;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld1 = 380.13195759877743;
    boolean lb2 = false;
    fb0 = fb1 && lb2;

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
    ab2 = !ab3;
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
        Output.points[2][6] += ad3;
    Thought lo0 = Thought95.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    double ld1 = 34.790703921526855;

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
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(ao1 != null){
          fo1 = ao1.m4();
}
    Output.points[2][7] -= fd1;
    double ld2 = 941.1382022256082;
    ld2 = fd0 + fd1;
    lb1 = !fb0;
    Thought lo3 = Thought56.getInstance(ld2, fd0, fd1, ld2);

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
    boolean lb0 = true;
if(ao1 != null){
      ao1.m3(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = fd0 < fd1;
    Output.points[2][8] += ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    boolean lb2 = false;
    fd1 *= -1;
    lb1 = ad1 < ad2;
if(fo1 != null){
      lb2 = fo1.m2();
}
    ad3 = ad4 - fd0;
    fb0 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;

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
    ab1 = fd0 < fd1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        for(int i1=0; i1<10; i1++){
            fb0 = fd0 > fd1;
if(ao4 != null){
              fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
            fd0 = fd1 - fd0;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
            Output.points[3][0] += fd1;
            double ld1 = 310.16357291597876;
            double ld2 = 479.61433008578416;
            ld1 = ld2 + fd0;
            Thought lo3 = Thought3.getInstance(ao3, ao4, fo0, fo1);
            fd1 = ld1 - ld2;
            ab1 = ab2 || ab3;
            double ld4 = 926.5595033885529;
            ld4 = fd0 + fd1;
if(ao2 != null){
              ao1 = ao2.m4(ld1, ld2, ld4, fd0, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
              ao3 = ao4.m4();
}
            fd1 = ld1 + ld2;
if(fo0 != null){
              fo0.m1(ld4, fd0, fd1, ld1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought84.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3();
}
    double ld2 = 595.2736819399518;
    fb0 = ad2 < ad3;
    ad4 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ld2, ad1);
}
    boolean lb3 = true;
if(ao2 != null){
      ao2.m3(lb1, lb3, ab1, ab2);
}
        ab3 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ab4 = ld2 < ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    if (fb1) {
if(ao3 != null){
          ld2 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
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
    Output.points[3][1] -= fd1;
    double ld0 = 519.0356094220831;
    boolean lb1 = true;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < ld0;
    lb1 = !fb0;
    fb1 = fd0 > fd1;
    double ld2 = 244.01569681795394;
    double ld3 = 794.8495799670931;
    ld0 *= -1;
    double ld4 = 624.807494940351;
    double ld5 = 430.5967036776583;
    Thought lo6 = Thought72.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, ld4, ld5, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2);
}
    fb0 = fb1 || lb1;
    fb0 = ld3 < ld4;
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
    fb0 = ld5 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, ld5, fd0, fd1, fb1, lb1, fb0, fb1);
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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[3][2] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    double ld0 = 189.1796417852195;
    Thought lo1 = Thought30.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    Output.points[3][3] -= fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    lb3 = ld0 < fd0;
    fd1 = ld0 + fd0;
    boolean lb4 = true;
    lb4 = !fb0;

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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
        Thought lo2 = Thought32.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld4 = 538.8632597775162;
    boolean lb5 = false;
    Thought lo6 = Thought35.getInstance(lb0, lb1, lb3, lb5);

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
